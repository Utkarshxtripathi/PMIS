import java.util.Scanner;

public class TNS2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      /*  System.out.println("Enter first number");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num1 = sc.nextInt();
        System.out.println("Sum of two numbers is " + (float)(num + num1));
        
        System.out.println("Enter Temperature in Fahrenheit");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius is " + celsius);

        System.out.println("Enter month Number");
        int month = sc.nextInt();
        switch(month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }

        // swap without using third variable
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b); 
        
        // convert a total number of seconds into hours, minutes and remaining seconds
        System.out.println("Enter total number of seconds");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println("Hours: " + hours + ", Minutes: " + minutes + ", Seconds: " + seconds);

        // Find  the Largest among three numbers
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest  is: " + num1);
        } else if (num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }*/

        // Find if the Year is a Leap Year or not
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if ((year%4 == 0 && year%100!= 0)||(year%400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //
    }

    
}
