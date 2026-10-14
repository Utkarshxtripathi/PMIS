// Producer-Consumer coordination pattern implemented by extending the Thread class
class BufferQueue {
    private int value;
    private boolean available;

    public synchronized void put(int value) throws InterruptedException {
        while (available) {
            wait();
        }

        this.value = value;
        available = true;
        System.out.println("Put : " + value);
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (!available) {
            wait();
        }

        int result = value;
        available = false;
        System.out.println("Getting data " + result);
        notifyAll();
        return result;
    }
}

class ThreadProducer extends Thread {
    private final BufferQueue queue;

    ThreadProducer(BufferQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int value = 405; value <= 406; value++) {
                queue.put(value);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(e);
        }
    }
}

class ThreadConsumer extends Thread {
    private final BufferQueue queue;

    ThreadConsumer(BufferQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                queue.get();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(e);
        }
    }
}

public class ProducerConsumerThread {
    public static void main(String[] args) {
        BufferQueue queue = new BufferQueue();

        ThreadProducer producer = new ThreadProducer(queue);
        ThreadConsumer consumer = new ThreadConsumer(queue);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(e);
        }
    }
}
