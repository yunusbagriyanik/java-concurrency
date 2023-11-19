package racecondition;

import java.util.concurrent.locks.ReentrantLock;

public class LockedIncrement {
    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            count += 1;
            System.out.println(Thread.currentThread().getName() + ": " + count);
        } finally {
            lock.unlock();
        }
    }

    public static class Starter {
        public static void main(String[] args) {
            LockedIncrement lockedIncrement = new LockedIncrement();
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(lockedIncrement::increment);
                thread.start();
            }
        }
    }
}
