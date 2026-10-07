import java.util.Scanner;
public class Exercise5 {
    // 5. Function that takes in age as input and returns if that person is eligible to vote (age > 18)
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (isEligibleToVote(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote (must be older than 18).");
        }
        sc.close();
    }
}
