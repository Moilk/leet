import java.util.concurrent.*;

class ZeroEvenOdd {
    private int n;
    private int x = 1;
    private Semaphore sem0 = new Semaphore(1);
    private Semaphore semOdd = new Semaphore(0);
    private Semaphore semEven = new Semaphore(0);
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            sem0.acquire();
            printNumber.accept(0);
            if ((i & 1) == 0) semEven.release();
            else semOdd.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            semEven.acquire();
            printNumber.accept(i);
            sem0.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            semOdd.acquire();
            printNumber.accept(i);
            sem0.release();
        }
    }
}