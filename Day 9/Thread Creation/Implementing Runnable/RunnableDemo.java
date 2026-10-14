// Thread creation by implementing the Runnable interface
public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        RunnableDemo obj = new RunnableDemo();

        Thread t = new Thread(obj);
        t.start();
    }
}
