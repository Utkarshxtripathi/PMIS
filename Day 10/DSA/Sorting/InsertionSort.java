import java.util.Arrays;

/**
 * Topic: DSA - Sorting: Insertion Sort
 * Subtopics: Building sorted array one item at a time, time complexity O(n^2), best case O(n) for nearly sorted data
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        System.out.println("Before: " + Arrays.toString(data));
        insertionSort(data);
        System.out.println("After:  " + Arrays.toString(data));
    }
}
