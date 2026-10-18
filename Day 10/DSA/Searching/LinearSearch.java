/**
 * Topic: DSA - Searching: Linear Search
 * Subtopics: Sequential search, time complexity O(n), best case O(1), unsorted arrays
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {15, 8, 42, 4, 16, 23};
        int target = 42;

        int result = linearSearch(numbers, target);
        System.out.println("Target " + target + (result != -1 ? " found at index " + result : " not found."));
    }
}
