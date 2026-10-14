// Thread creation by extending the Thread class
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadDemo obj = new ThreadDemo();
        obj.start();
    }
}
