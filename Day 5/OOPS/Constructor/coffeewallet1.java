package Constructor;

class CoffeeWallet {

    String name;
    double balance;

    // Constructor
    CoffeeWallet(String name, double initialDeposit) {
        this.name = name;
        this.balance = initialDeposit;
    }

    // Add money
    void addFunds(double amount) {
        balance = balance + amount;
        System.out.println("Added ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Purchase
    void purchase(double amount) {

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Purchase successful: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Account overview
    void showOverview() {
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class CoffeeWallet1 {

    public static void main(String[] args) {

        // Opening account with ₹500
        CoffeeWallet wallet = new CoffeeWallet("Utkarsh", 500);

        wallet.showOverview();

        // Add ₹200
        wallet.addFunds(200);

        // Buy ₹150 snack
        wallet.purchase(150);

        // Attempt to buy ₹800
        wallet.purchase(800);

        // Final overview
        wallet.showOverview();
    }
}