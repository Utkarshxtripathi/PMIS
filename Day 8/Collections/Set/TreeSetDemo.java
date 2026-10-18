import java.util.Set;
import java.util.TreeSet;

/**
 * Topic: Collections Framework - Set: TreeSet
 * Subtopics: SortedSet, NavigableSet, Red-Black Tree, natural ascending order, first(), last(), subset()
 * 
 * Features:
 * - Elements are stored in sorted ascending order
 * - Guaranteed O(log n) time cost for basic operations
 * - Does not allow null elements
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // TODO: Practice TreeSet navigation and ordering
        System.out.println("TreeSet (Sorted): " + numbers);
    }
}
