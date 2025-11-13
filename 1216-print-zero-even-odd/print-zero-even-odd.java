class ZeroEvenOdd {
    private int n;
    private Semaphore zs = new Semaphore(1);
    private Semaphore os = new Semaphore(0);
    private Semaphore es = new Semaphore(0);
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            zs.acquire();
            printNumber.accept(0);
            if(i%2==0){
                es.release();
            } else {
                os.release();
            }
        }
        
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2;i<=n;i+=2){
            es.acquire();
            printNumber.accept(i);
            zs.release();
        }

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i =1;i<=n;i+=2){
            os.acquire();
            printNumber.accept(i);
            zs.release();
        }
        
    }
}