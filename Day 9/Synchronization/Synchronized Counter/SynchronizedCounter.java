// Thread-safe shared counter increment using synchronized method
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class SynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);
    }
}
