// Demonstrating concurrent execution of multiple threads with custom names
public class ConcurrentExecutionDemo extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + " " + i
            );
        }
    }

    public static void main(String[] args) {
        ConcurrentExecutionDemo t1 = new ConcurrentExecutionDemo();
        ConcurrentExecutionDemo t2 = new ConcurrentExecutionDemo();

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();
    }
}
