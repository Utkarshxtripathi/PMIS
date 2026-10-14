// Pausing thread execution using Thread.sleep() and handling InterruptedException
public class ThreadSleepDemo extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        ThreadSleepDemo t = new ThreadSleepDemo();
        t.start();
    }
}
