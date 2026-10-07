import java.util.Scanner;
public class Exercise2 {
    // 2. Function to print the sum of all odd numbers from 1 to n
    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to " + n + " = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        printSumOfOddNumbers(n);
        sc.close();
    }
}
