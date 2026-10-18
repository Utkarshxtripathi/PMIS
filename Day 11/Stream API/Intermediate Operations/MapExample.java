import java.util.Arrays;
import java.util.List;

// map(Function) - Transforms each item
// Example: .map(n -> n * 2)
// Result: 10, 24, 16, 6, 40, 14, 24

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Mapped (n * 2): ");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(n -> System.out.print(n + " "));
    }
}
