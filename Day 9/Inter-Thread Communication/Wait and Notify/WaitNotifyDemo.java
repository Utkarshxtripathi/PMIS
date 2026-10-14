// Low-level coordination between threads using wait() and notify() on a shared monitor object
public class WaitNotifyDemo {
    public static void main(String[] args) {
        Object obj = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                try {
                    System.out.println("Waiting...");
                    obj.wait();
                    System.out.println("Woken up");
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                obj.notify();
            }
        });

        t1.start();

        try {
            Thread.sleep(500); // Ensures t1 enters the wait state first
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        t2.start();
    }
}
