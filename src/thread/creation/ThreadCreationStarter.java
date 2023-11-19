package thread.creation;

import thread.creation.thread.CustomThread;
import thread.creation.runnable.RunnableImpl;

public class ThreadCreationStarter {
    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread();
        RunnableImpl runnable = new RunnableImpl();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        Thread thread = new Thread(() -> {
            System.out.println("Anonymous Declarations " + Thread.currentThread().getName());
        });
        thread.start();

        Thread thread0 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread01 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread0.start();
        thread01.start();
    }
}
