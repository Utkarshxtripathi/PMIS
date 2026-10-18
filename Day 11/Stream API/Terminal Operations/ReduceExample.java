import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Topic: Stream API - Terminal Operation: reduce()
 * Subtopics: Combining elements, accumulator function, sum/product calculation
 */
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum elements using reduce
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        sum.ifPresent(s -> System.out.println("Reduced Sum: " + s));

        // With identity value
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Reduced Product: " + product);
    }
}
