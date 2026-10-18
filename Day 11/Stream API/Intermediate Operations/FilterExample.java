import java.util.Arrays;
import java.util.List;

// filter(Predicate) - Keeps items that pass the test
// Example: .filter(n -> n > 7)
// Result: 12, 8, 20, 12

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Filtered (n > 7): ");
        numbers.stream()
               .filter(n -> n > 7)
               .forEach(n -> System.out.print(n + " "));
    }
}
