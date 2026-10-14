// Setting and checking thread priorities (MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY)
public class ThreadPriorityDemo extends Thread {

    @Override
    public void run() {
        System.out.println(
            getName() + " Priority: " + getPriority()
        );
    }

    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();

        t1.setName("Thread A");
        t2.setName("Thread B");
        t3.setName("Thread C");

        t1.setPriority(Thread.MIN_PRIORITY);   // Priority: 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority: 5
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority: 10

        t1.start();
        t2.start();
        t3.start();
    }
}
