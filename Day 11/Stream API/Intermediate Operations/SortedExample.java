import java.util.Arrays;
import java.util.List;

// sorted() - Sorts in natural order (ascending)
// Example: .sorted()
// Result: 3, 5, 7, 8, 12, 12, 20

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Sorted (natural order): ");
        numbers.stream()
               .sorted()
               .forEach(n -> System.out.print(n + " "));
    }
}
