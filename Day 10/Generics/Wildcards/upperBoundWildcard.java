import java.util.Arrays;
import java.util.List;

public class upperBoundWildcard {

    static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number number : list) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Float> floats = Arrays.asList(1.6f, 2.5f, 3.7f);
        List<Double> decimals = Arrays.asList(1.5, 2.8, 3.9);

        System.out.println(sum(integers));
        System.out.println(sum(floats));
        System.out.println(sum(decimals));
    }
}
