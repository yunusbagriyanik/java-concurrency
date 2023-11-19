package thread.creation.thread;

public class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
