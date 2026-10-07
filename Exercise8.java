import java.util.Scanner;

public class Exercise8 {

    // 8. Function to find x raised to the power n (x^n)
    public static double calculatePower(double x, int n) {
        double result = 1;
        for (int i = 1; i <= Math.abs(n); i++) {
            result *= x;
        }
        if (n < 0) {
            return 1.0 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter power (n): ");
        int n = sc.nextInt();

        double power = calculatePower(x, n);
        System.out.println(x + "^" + n + " = " + power);

        sc.close();
    }
}
