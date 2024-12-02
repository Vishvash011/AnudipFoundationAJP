package Inheritance;

class User {
    private int id;
    private String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Employee class (child class) that inherits from User class
class Employee extends User {
    private double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        super(id, name); // Calls the constructor of the parent class
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Annual salary is 12 times the monthly salary
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee employee = new Employee(1, "John Doe", 5000.0);

        // Calculate and display the annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + annualSalary);
    }
}
