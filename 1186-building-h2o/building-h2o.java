class H2O {
    private final Semaphore canPrintHydrogens;
    private final Semaphore hasPrintHydrogens;

    public H2O() {
        canPrintHydrogens = new Semaphore(2);

        hasPrintHydrogens = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		canPrintHydrogens.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();

        hasPrintHydrogens.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        hasPrintHydrogens.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();

        canPrintHydrogens.release(2);
    }
}