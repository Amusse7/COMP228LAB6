package Lab6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1000); // Initial balance $1000

        // Creating a transactions list
        ArrayList<Transaction> transactions = new ArrayList<>();

        // to manage threads
        ExecutorService executor = Executors.newCachedThreadPool();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    transactions.add(new Transaction(account, depositAmount, true));
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    transactions.add(new Transaction(account, withdrawAmount, false));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        for (Transaction transaction : transactions) {
            executor.execute(transaction);
        }

        executor.shutdown();

        // Display the ending balance
        System.out.println("Final balance: $" + account.getBalance());
        scanner.close();
    }
}
