import java.util.Scanner;
public class Exercise10 {
    // 10. Program to print Fibonacci series of n terms where n is input by user
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }
        System.out.print("Fibonacci series (" + n + " terms): ");
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}
