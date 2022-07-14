package Multithreading;

public class ClassForThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Первый поток");
    }
    public synchronized int increment(int counter) {
        counter++;
        return counter;
    }
}

class JThread extends Thread {
    @Override
    public void run() {
        System.out.println("Второй поток");
    }
    public synchronized int increment(int counter) {
        counter++;
        return counter;
    }
}

class KThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}
