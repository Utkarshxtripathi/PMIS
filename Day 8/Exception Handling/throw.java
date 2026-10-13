package Day 8.Exception Handling;

public class throw {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
        if(age<0){
            throw new IllegalArgumentException(
                "Age cannot be negative"
            );
        }
        System.out.println("Age"+ age);
    }
}
