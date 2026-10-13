//package Day 8.Exception Handling;
/*Problem Statement:

Write a program that takes two integer inputs from the user and calculates their division. 
If the second number is zero, handle the resulting ArithmeticException gracefully and 
print an error message instead of crashing. */

import java.util.Scanner;

public class ProblemStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 No.");
        int a= sc.nextInt();
        int b=sc.nextInt();
            try {
                 int result=a/b;
                 System.out.println(result);
                
            } catch (Exception e) {
                System.out.println("Cannot divide by 0");
            }
        }
    }
    

