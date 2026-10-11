class BankAccount {
    String accountHolder;

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 4.5;

    SavingsAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    void displayDetails() {
        System.out.println("Interest rate: " + interestRate + " %");
    }
}
