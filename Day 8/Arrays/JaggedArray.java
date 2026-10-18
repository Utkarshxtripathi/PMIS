/**
 * Topic: Jagged Arrays
 * Subtopics: Jagged arrays (arrays with varying row lengths), dynamic memory allocation
 */
public class JaggedArray {
    public static void main(String[] args) {
        // Jagged array: 3 rows with varying column sizes
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5, 6};
        jagged[2] = new int[]{7, 8, 9};

        // TODO: Traverse and display the jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
