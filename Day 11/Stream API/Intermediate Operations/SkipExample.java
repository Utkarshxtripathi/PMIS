import java.util.Arrays;
import java.util.List;

// skip(n) - Skips the first n elements
// Example: .skip(5)
// Result: 7, 12

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Skip (first 5): ");
        numbers.stream()
               .skip(5)
               .forEach(n -> System.out.print(n + " "));
    }
}
