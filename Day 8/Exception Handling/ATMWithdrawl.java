package Day 8.Exception Handling;

public class ATMWithdrawl {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 7000;

        try{
            if(withdrawal>balance){
                throw new IllegalArgumentException(
                    "Insufficient balance"
                );

            }
            balance-=withdrawal;
            System.out.println("Withdrawl was success");
            System.out.println("Remaoning balance"+balance);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("program complered");
    }
}
