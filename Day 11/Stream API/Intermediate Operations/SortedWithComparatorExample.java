import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// sorted(Comparator) - Sorts with custom rule
// Example: .sorted(Comparator.reverseOrder())
// Result: 20, 12, 12, 8, 7, 5, 3

public class SortedWithComparatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 7, 12);

        System.out.println("Original List: " + numbers);

        System.out.print("Sorted (reverse order): ");
        numbers.stream()
               .sorted(Comparator.reverseOrder())
               .forEach(n -> System.out.print(n + " "));
    }
}
