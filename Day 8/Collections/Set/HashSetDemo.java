import java.util.HashSet;
import java.util.Set;

/**
 * Topic: Collections Framework - Set: HashSet
 * Subtopics: Unique elements, hashing, hashCode() and equals(), unordered collection
 * 
 * Features:
 * - Backed by HashMap
 * - Guarantees no duplicates
 * - Constant time O(1) performance for basic operations (add, remove, contains)
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate - will be ignored

        // TODO: Practice HashSet methods
        System.out.println("HashSet: " + set);
    }
}
