import java.util.Arrays;
import java.util.List;

// limit(n) - Takes the first n elements
// Example: .limit(3)
// Result: 5, 12, 8

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Limit (first 3): ");
        numbers.stream()
               .limit(3)
               .forEach(n -> System.out.print(n + " "));
    }
}
