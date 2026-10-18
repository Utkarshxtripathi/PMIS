import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Topic: Stream API - Terminal Operation: collect()
 * Subtopics: Collectors.toList(), Collectors.toSet(), Collectors.joining()
 */
public class CollectExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apple");

        List<String> upperList = fruits.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
        System.out.println("Collected List: " + upperList);

        Set<String> uniqueSet = fruits.stream()
                                      .collect(Collectors.toSet());
        System.out.println("Collected Set: " + uniqueSet);
    }
}
