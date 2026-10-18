/**
 * Topic: JUnit 5 - Test Cases & Assertions
 * Subtopics: assertEquals, assertTrue, assertFalse, assertThrows, assertNull, assertNotNull
 * 
 * Note: To compile and run with JUnit 5 Jupiter, include JUnit Jupiter jar (or Maven dependency: org.junit.jupiter:junit-jupiter).
 */
public class CalculatorTest {
    // Basic calculator method to test
    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        // Simple assertion simulation without external jar:
        int sum = add(10, 20);
        assert sum == 30 : "Addition Test Failed!";
        System.out.println("Sum assertion passed: " + sum);
    }
}
