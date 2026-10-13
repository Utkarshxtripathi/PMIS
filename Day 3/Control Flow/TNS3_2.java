import java.util.Scanner;
public class TNS3_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number whose Area you want to find 1.Triangle 2.square 3. rectangle");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the base and height of the triangle");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of Triangle: " + areaTriangle);
                break;
            case 2:
                System.out.println("Enter the side of the square");
                double side = sc.nextDouble();
                double areaSquare = side * side;
                System.out.println("Area of Square: " + areaSquare);
                break;
            case 3:
                System.out.println("Enter the length and breadth of the rectangle");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                double areaRectangle = length * breadth;
                System.out.println("Area of Rectangle: " + areaRectangle);
                break;
            default:
                System.out.println("Invalid choice");
        }        
    }
}