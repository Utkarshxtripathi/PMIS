import java.util.Scanner;

public class Exercise1 {

    public static void printAverage(double num1, double num2, double num3) {
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " = " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        printAverage(num1, num2, num3);

        sc.close();
    }
}
