/**
 * Topic: DSA - Stack Basics
 * Subtopics: LIFO (Last-In-First-Out) principle, push, pop, peek, isEmpty, isFull operations
 */
public class StackBasics {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackBasics(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) return -1;
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackBasics stack = new StackBasics(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
    }
}
