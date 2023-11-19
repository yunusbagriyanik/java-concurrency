package thread.creation.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 20; i++) {
            int task = i;
            executor.submit(() -> System.out.println(Thread.currentThread().getName() + " is executing task " + task));
        }
        executor.shutdown();
    }
}
