// Using join() to make the main thread wait for child thread completion
public class ThreadJoinDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Child thread running");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoinDemo t = new ThreadJoinDemo();
        t.start();

        t.join();

        System.out.println("Main finished");
    }
}
