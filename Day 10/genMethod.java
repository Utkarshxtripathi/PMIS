import java.util.*;
class Util {
    static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    static <T> T firstOf(T a, T b) {
        return b;
    }
}

public class genMethod {
    public static void main(String[] args) {
        Util.printTwice("Hi");
        Util.printTwice(100);
        System.out.println(Util.firstOf("Hi","Hello"));
    }
}
