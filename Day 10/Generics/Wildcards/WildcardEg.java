import java.util.Arrays;
import java.util.List;

public class WildcardEg {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Utkarsh", "Devesh", "Prateek");
        List<Integer> numbers = Arrays.asList(100, 99, 98);
        List<Double> prices = Arrays.asList(99.5, 99.6, 99.7);

        System.out.println("Names:");
        printList(names);

        System.out.println("\nNumbers:");
        printList(numbers);

        System.out.println("\nPrices:");
        printList(prices);
    }
}
