/**
 * Key Concept Demonstration: Java Integer Cache
 * Values between -128 and 127 are pre-cached by Java's IntegerCache.
 * Demonstrates identity comparison (==) vs equality comparison (equals()).
 */
public class IntegerCacheDemo {
    public static void main(String[] args) {
        // Values within [-128, 127] reuse cached instances
        Integer a = 100;
        Integer b = 100;
        System.out.println("--- Within Cache Range (-128 to 127) ---");
        System.out.println("Integer a = 100, Integer b = 100");
        System.out.println("a == b : " + (a == b));             // true (same cached reference)
        System.out.println("a.equals(b) : " + a.equals(b));     // true (same value)

        // Values outside [-128, 127] instantiate new objects
        Integer c = 200;
        Integer d = 200;
        System.out.println("\n--- Outside Cache Range ---");
        System.out.println("Integer c = 200, Integer d = 200");
        System.out.println("c == d : " + (c == d));             // false (different object references)
        System.out.println("c.equals(d) : " + c.equals(d));     // true (same value)
    }
}
