package concurrency;

import java.util.concurrent.CountDownLatch;

public class PrintInOrder1114 {


    CountDownLatch second;
    CountDownLatch third;

    public PrintInOrder1114() {
        second = new CountDownLatch(1);
        third = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        third.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        third.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }


}
