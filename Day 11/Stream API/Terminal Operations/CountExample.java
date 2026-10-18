import java.util.Arrays;
import java.util.List;

/**
 * Topic: Stream API - Terminal Operation: count(), min(), max()
 * Subtopics: Counting elements, finding extrema with Comparator
 */
public class CountExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        long count = numbers.stream()
                            .filter(n -> n > 7)
                            .count();
        System.out.println("Count of numbers > 7: " + count);
    }
}
