import java.util.ArrayList;
import java.util.List;

/**
 * Topic: Collections Framework - List: ArrayList
 * Subtopics: Dynamic array, index-based access, add, get, set, remove, size, iterator
 * 
 * Features:
 * - Backed by resizable array
 * - Fast random access O(1) by index
 * - Insertion/deletion is slower O(n) due to shifting
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // TODO: Practice common ArrayList operations (get, remove, contains, iteration)
        System.out.println("ArrayList: " + list);
    }
}
