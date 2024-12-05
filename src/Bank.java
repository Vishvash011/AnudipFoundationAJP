public class Bank {
    double amount;

    // Constructor to initialize the account with an initial balance
    public Bank(double amount) {
        this.amount = amount;
    }

    /**
     * Updates the account balance after a withdrawal.
     * If the withdrawal amount exceeds the current balance, the withdrawal is unsuccessful.
     *
     * @param withdraw the amount to withdraw
     * @return the updated account balance
     */
    public double withdrawAmount(double withdraw) {
        // Check if sufficient balance is available for withdrawal
        System.out.println((amount >= withdraw) ? "Withdraw Successful" : "Withdraw Unsuccessful");
        amount = (amount >= withdraw) ? (amount - withdraw) : amount;
        return amount;
    }

    /**
     * Updates the account balance after a deposit.
     *
     * @param deposit the amount to deposit
     * @return the updated account balance
     */
    public double depositAmount(double deposit) {
        amount += deposit;
        return amount;
    }

    public static void main(String[] args) {
        // Create an object of the Bank class with an initial balance of 10,000
        Bank obj = new Bank(10000);

        // Attempt to withdraw 5,500 from the account
        obj.withdrawAmount(5500);

        // Deposit 12,000 into the account
        obj.depositAmount(12000);

        // Attempt to withdraw 1,200 from the account
        obj.withdrawAmount(1200);

        // Print the final account balance
        System.out.println("Total Balance: " + obj.amount);
    }
}
