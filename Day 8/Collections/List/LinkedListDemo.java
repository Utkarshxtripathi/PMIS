import java.util.LinkedList;
import java.util.List;

/**
 * Topic: Collections Framework - List: LinkedList
 * Subtopics: Doubly-linked list implementation, Deque methods (addFirst, addLast, removeFirst, removeLast)
 * 
 * Features:
 * - Faster insertion and deletion O(1) at ends
 * - Slower random access O(n)
 * - Implements both List and Deque interfaces
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Node 1");
        list.addFirst("Head");
        list.addLast("Tail");

        // TODO: Practice LinkedList methods and compare performance with ArrayList
        System.out.println("LinkedList: " + list);
    }
}
