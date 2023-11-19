package racecondition;

public class Increment {
    private int count = 0;

    public void increment() {
        count += 1;
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }

    public static class Starter {
        public static void main(String[] args) {
            Increment increment = new Increment();
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(increment::increment);
                thread.start();
            }
        }
    }
}
