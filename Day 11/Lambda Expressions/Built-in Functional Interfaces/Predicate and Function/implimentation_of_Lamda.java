import java.util.function.Predicate;
import java.util.function.Function;

public class implimentation_of_Lamda {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(20));
        System.out.println(isAdult.test(15));

        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("John"));
    }
}
