import java.util.Scanner;

public class Exercise4 {

    // 4. Function that takes radius as input and returns the circumference of a circle
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double circumference = getCircumference(radius);
        System.out.println("Circumference of circle = " + circumference);

        sc.close();
    }
}
