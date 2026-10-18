import java.util.Arrays;
import java.util.List;

// distinct() - Removes duplicates
// Example: .distinct()
// Result: 5, 12, 8, 3, 20, 7

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Distinct (no duplicates): ");
        numbers.stream()
               .distinct()
               .forEach(n -> System.out.print(n + " "));
    }
}
