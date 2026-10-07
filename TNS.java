import java.util.Scanner;
public class TNS {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("I PLAY FOOTBALL");
        System.out.println("MANGO\nAPPLE\nCHERRY");
        
        String name;
        name=sc.nextLine();
        System.out.println("Your Name is" + name);
        System.out.println(500 + " + " + 555); 
        
        System.out.println("A B C\nD E F\nG H I");
        
        System.out.println("Enter your First name");
        String firstName = sc.nextLine();
        System.out.println("Enter your Last name");
        String lastName = sc.nextLine();
        System.out.println("Hii" + "\"" + firstName + " " + lastName + "\"");
        
        System.out.println("Enter first number");   
        int num1=sc.nextInt();  
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        if(num1>num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1<num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal");
        }
      
    }
}
