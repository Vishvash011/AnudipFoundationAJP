package Aggregation;

class Bank{
    String name;

    public Bank(String name){
        this.name = name;
    }
}

class Accounts{
    String typeOfAccount;
    Bank b;

    public Accounts(String typeOfAccount, Bank b){
        this.b = b;
        this.typeOfAccount = typeOfAccount;
    }
}

class Customer{
    String customerName;
    long accountNo;
    String city;

    Accounts ac;

    public Customer(String customerName, long accountNo, String city, Accounts ac) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.city = city;
        this.ac = ac;
    }

    public void display(){
        System.out.println(customerName + " has a " + ac.typeOfAccount + " account in " + ac.b.name + " in " + city + " and his account number is : " + accountNo);
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Baroda");
        Accounts ac = new Accounts("Saving", bank);
        Customer customer = new Customer("Vishvash Ame", 123456009, "Indore", ac );

        customer.display();
    }
}
