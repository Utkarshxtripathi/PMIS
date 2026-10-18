import java.util.Arrays;

/**
 * Topic: DSA - Sorting: Bubble Sort
 * Subtopics: Adjacent element comparison and swapping, time complexity O(n^2), stable sort
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimized: stop if array is already sorted
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("After:  " + Arrays.toString(data));
    }
}
