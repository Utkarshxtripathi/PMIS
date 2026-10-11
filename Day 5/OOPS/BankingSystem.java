class Bank
{

    String AccHolder;
    Double Acc_Balace;

    Bank(String AccHolder,Double Acc_Balace)
    {
        this.AccHolder=AccHolder;
        this.Acc_Balace=Acc_Balace;
    }

    public void Deposit(Double Money)
    {
        Acc_Balace += Money;
        System.out.println(Money + " is Deposited to Your Account");
    }
    public void withdraw(Double Money)
    {
    if(Money <= Acc_Balace){
        Acc_Balace -= Money;
        System.out.println(Money + " is Withdrawn from Your Account");
    } else {
        System.out.println("Insufficient Balance");
    }
    }
    public void AccountBalance(){
        System.out.println(Acc_Balace);
    }
}

public class BankingSystem {
    public static void main(String[]args){
        Bank obj = new Bank("Utkarsh", 1000);
        obj.AccountBalance();
        


    }
}

