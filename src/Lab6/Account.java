package Lab6;
public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " completed.");
        displayBalance();
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " completed.");
            displayBalance();
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    private void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
