package thread.creation.runnable;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
