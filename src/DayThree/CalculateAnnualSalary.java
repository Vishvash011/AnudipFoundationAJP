package DayThree;

class User {
    private int id;
    private String name;

    // Parameterized constructor to initialize User properties
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter method for user ID
    public int getId() {
        return id;
    }

    // Getter method for user name
    public String getName() {
        return name;
    }
}

// Subclass Employee that inherits from User
class Employee extends User {
    private double salary;

    // Constructor to initialize Employee properties (id, name, and salary)
    public Employee(int id, String name, double salary) {
        super(id, name); // Call the parent class (User) constructor
        this.salary = salary;
    }

    // Setter method to update the salary if needed
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Method to calculate the annual salary of the employee
    public double calculateAnnualSalary() {
        return salary * 12; // Annual salary = monthly salary × 12
    }
}

// Main class to demonstrate functionality
public class CalculateAnnualSalary {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee(101, "Vishvash Ame", 50000);

        // Display employee details
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());

        // Calculate and display the annual salary of the employee
        double annualSalary = emp.calculateAnnualSalary();
        System.out.println("Annual Salary: " + annualSalary);
    }
}
