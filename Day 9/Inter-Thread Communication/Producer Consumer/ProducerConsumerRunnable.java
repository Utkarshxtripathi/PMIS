// Producer-Consumer pattern using wait() and notifyAll() with Runnable workers
class Q {
    int num;
    boolean available = false;

    synchronized void put(int n) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        num = n;
        available = true;

        System.out.println("Produced: " + num);
        notifyAll();
    }

    synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }

        System.out.println("Consumed: " + num);
        available = false;

        notifyAll();
        return num;
    }
}

class Producer implements Runnable {
    private final Q q;

    Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            q.put(i);
        }
    }
}

class Consumer implements Runnable {
    private final Q q;

    Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            q.get();
        }
    }
}

public class ProducerConsumerRunnable {
    public static void main(String[] args) {
        Q q = new Q();

        Thread p = new Thread(new Producer(q));
        Thread c = new Thread(new Consumer(q));

        p.start();
        c.start();
    }
}
