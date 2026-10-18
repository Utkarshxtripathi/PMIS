import java.util.function.Function;

public class Problem1 {
    public static void main(String[] args) {
        Function<Integer, Integer> calculateArea = side -> side * side;

        int side = 5;
        System.out.println("Area of square: " + calculateArea.apply(side));
    }
}
