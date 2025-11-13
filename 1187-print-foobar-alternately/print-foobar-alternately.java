class FooBar {
    private int n;
    private CountDownLatch[] latchesAfterFoo;
    private CountDownLatch[] latchesAfterBar;

    public FooBar(int n) {
        this.n = n;
        this.latchesAfterFoo= new CountDownLatch[n];
        this.latchesAfterBar = new CountDownLatch[n];
        for(int i=0;i<n;i++){
            latchesAfterFoo[i]= new CountDownLatch(1);
            latchesAfterBar[i]= new CountDownLatch(1);
        }
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            if(i>0){
                latchesAfterBar[i-1].await();
            }
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            latchesAfterFoo[i].countDown();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            latchesAfterFoo[i].await();
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();

            latchesAfterBar[i].countDown();
        }
    }
}