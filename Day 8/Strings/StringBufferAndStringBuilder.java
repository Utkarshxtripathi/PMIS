/**
 * Topic: String vs StringBuffer vs StringBuilder & Immutability
 * Subtopics: Immutability of String, Mutability, Thread-Safety (StringBuffer), Performance (StringBuilder)
 * 
 * Comparison:
 * - String: Immutable (creates new object on modification), thread-safe.
 * - StringBuffer: Mutable, Synchronized (Thread-safe, slower).
 * - StringBuilder: Mutable, Non-synchronized (Fastest, single-threaded).
 */
public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        // TODO: Demonstrate append, reverse, insert, and performance difference
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);

        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Streams");
        System.out.println("StringBuilder: " + sbd);
    }
}
