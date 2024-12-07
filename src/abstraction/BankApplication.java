package abstraction;

import java.util.Scanner;

abstract class BankAccount {
    public double balance;
    public int transactionCount;
    public String[] transactionHistory;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new String[10];
        this.transactionCount = 0;
        addTransaction("Account created with balance: " + initialBalance);
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayTransactionHistory();

    public void addTransaction(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount++] = transaction;
        } else {
            System.out.println("Transaction history is full.");
        }
    }
}

class BankOfBaroda extends BankAccount {
    BankOfBaroda(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Current Balance: " + balance);
            addTransaction("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Current Balance: " + balance);
            addTransaction("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("\nTransaction history:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionHistory[i]);
        }
        System.out.println("Remaining Balance is : " + balance);
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankOfBaroda account = new BankOfBaroda(5000.0);

        while (true) {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View transaction history");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayTransactionHistory();
                    break;
                case 4:
                    System.out.println("Thank you for using the bank system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
