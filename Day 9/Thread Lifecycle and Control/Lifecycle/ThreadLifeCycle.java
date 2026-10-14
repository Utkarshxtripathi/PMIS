// Inspecting thread state transitions using getState()
public class ThreadLifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadLifeCycle t = new ThreadLifeCycle();

        // Displays NEW state before thread is started
        System.out.println(t.getState());

        t.start();

        System.out.println("Thread started");
    }
}
