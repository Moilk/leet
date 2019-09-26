import java.util.concurrent.*;

class Foo {
    private Semaphore a = new Semaphore(1);
    private Semaphore b = new Semaphore(0);
    private Semaphore c = new Semaphore(0);

    public Foo() {
        
    }
    
    public void first(Runnable printFirst) throws InterruptedException {
        a.acquire();
        printFirst.run();
        b.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        b.acquire();
        printSecond.run();
        c.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        c.acquire();
        printThird.run();
        a.release();
    }
}