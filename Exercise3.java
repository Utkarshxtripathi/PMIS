import java.util.Scanner;
public class Exercise3 {
    // 3. Function which takes in 2 numbers and returns the greater of those two
    public static int getGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int greater = getGreater(a, b);
        System.out.println("The greater number is: " + greater);
        sc.close();
    }
}
