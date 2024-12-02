//Create a Bank class and declare an instance variable named amount of type double.Create parameterized constructor to
// initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and
// deposit(double depositAmount).Calculate withdrawal based on some condition (using ternary operator) like If amount
// is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after
// withdraw. Later on, deposit 5000 in the account balance.At the end display total balance on the console.
public class Bank {
    double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public double withdrawAmount(double withdraw) {
        amount = (amount >= withdraw) ? (amount - withdraw) : amount;
        System.out.println((amount >= withdraw) ? "Withdraw Successful" : "Withdraw Unsuccessful");
        return amount;
    }

    public double depositAmount(double deposit) {
        amount += deposit;
        return amount;
    }

    public static void main(String[] args) {
        Bank obj = new Bank(10000);


        obj.withdrawAmount(5500);
        obj.depositAmount(12000);
        obj.withdrawAmount(1200);


        System.out.println("Total Balance: " + obj.amount);
    }
}
