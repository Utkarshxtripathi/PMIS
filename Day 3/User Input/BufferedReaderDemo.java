import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Topic: User Input using BufferedReader
 * Subtopics: InputStreamReader, BufferedReader, fast I/O vs Scanner
 * 
 * Key Points:
 * - BufferedReader is synchronized, has larger buffer (8KB vs 1KB for Scanner).
 * - Reads text as lines, requires explicit parsing (Integer.parseInt, etc.).
 * - Throws checked IOException.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Read a string and an integer using BufferedReader
        System.out.println("BufferedReader User Input Demo");
    }
}
