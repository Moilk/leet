import java.util.concurrent.*;

class Foo {
    private CountDownLatch  c0 = new CountDownLatch(1);
    private CountDownLatch  c1 = new CountDownLatch(1);
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        c0.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        c0.await();
        printSecond.run();
        c1.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        c1.await();
        printThird.run();
    }
}