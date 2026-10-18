/**
 * Topic: DSA - Queue Basics
 * Subtopics: FIFO (First-In-First-Out) principle, enqueue, dequeue, peek, isEmpty, isFull operations
 */
public class QueueBasics {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueBasics(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int value) {
        if (nItems == maxSize) {
            System.out.println("Queue Overflow");
            return;
        }
        if (rear == maxSize - 1) rear = -1;
        queueArray[++rear] = value;
        nItems++;
    }

    public int dequeue() {
        if (nItems == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) front = 0;
        nItems--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public static void main(String[] args) {
        QueueBasics queue = new QueueBasics(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front after dequeue: " + queue.peek());
    }
}
