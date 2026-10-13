/**
 * Problem 1: Parse and sum a comma-separated string
 * Task: Given a string of numbers separated by commas, extract each number and calculate the total sum.
 * Key concept: Integer.parseInt() or Integer.valueOf().
 */
public class StringSum {
    public static void main(String[] args) {
        String input = "10,25,40,15,60";
        String[] parts = input.split(",");
        int total = 0;

        for (String part : parts) {
            // Convert String to primitive int using wrapper method
            total += Integer.parseInt(part);
        }

        System.out.println("Total sum: " + total);
    }
}
