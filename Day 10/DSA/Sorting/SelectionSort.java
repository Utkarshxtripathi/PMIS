import java.util.Arrays;

/**
 * Topic: DSA - Sorting: Selection Sort
 * Subtopics: Finding minimum element and placing at the beginning, time complexity O(n^2), in-place
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13};
        System.out.println("Before: " + Arrays.toString(data));
        selectionSort(data);
        System.out.println("After:  " + Arrays.toString(data));
    }
}
