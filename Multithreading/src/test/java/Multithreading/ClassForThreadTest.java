package Multithreading;

import org.junit.Test;

public class ClassForThreadTest {
    @Test
    public void TestOne() {
        ClassForThread thread = new ClassForThread();
        JThread jThread = new JThread();
        thread.run();
        jThread.start();
    }

    @Test
    public void TestTwo() throws InterruptedException {
        ClassForThread thread = new ClassForThread();
        JThread jThread = new JThread();
        thread.run();
        jThread.start();
        jThread.join();
    }

    @Test
    public void TestThree() {
        ClassForThread thread = new ClassForThread();
        JThread jThread = new JThread();
        thread.run();
        jThread.setDaemon(true);
        jThread.start();
    }

    @Test
    public void TestFour() {
        int counter = 0;
        ClassForThread thread = new ClassForThread();
        JThread jThread = new JThread();
        thread.run();
        jThread.start();
        synchronized (this) {
            thread.increment(counter);
            thread.increment(counter);
            jThread.increment(counter);
        }
    }

    @Test
    public void TestFive() throws InterruptedException {
        JThread jThread = new JThread();
        jThread.start();
        Thread thread = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(5000);
                    synchronized (jThread) {
                        jThread.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.setDaemon(true);
        thread.start();
        synchronized (jThread) {
            jThread.wait();
        }
    }

    @Test
    public void TestSix() throws InterruptedException {
        JThread jThread = new JThread();
        jThread.start();
        Thread thread = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(5000);
                    synchronized (jThread) {
                        jThread.interrupt();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        synchronized (jThread) {
            jThread.wait();
        }
    }
}
