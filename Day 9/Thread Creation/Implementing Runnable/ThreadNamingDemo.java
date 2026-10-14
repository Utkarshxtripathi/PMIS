// Assigning a custom thread name during thread creation using Thread(Runnable, String)
public class ThreadNamingDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Now the thread is running....");
    }

    public static void main(String[] args) {
        Runnable obj = new ThreadNamingDemo();

        Thread t1 = new Thread(obj, "My new thread");
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
