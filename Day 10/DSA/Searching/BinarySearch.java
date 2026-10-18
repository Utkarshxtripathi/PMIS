/**
 * Topic: DSA - Searching: Binary Search
 * Subtopics: Divide and Conquer, requires sorted array, time complexity O(log n)
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int target = 23;

        int result = binarySearch(sortedNumbers, target);
        System.out.println("Target " + target + (result != -1 ? " found at index " + result : " not found."));
    }
}
