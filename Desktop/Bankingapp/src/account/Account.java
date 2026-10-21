
package account;

public class Account {
    double balance = 10000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(500);
        acc.displayBalance();
    }
}
