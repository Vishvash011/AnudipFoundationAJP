package Aggregation;


import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private String city;

    public University(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void displayUniversity() {
        System.out.println("University Name: " + name);
        System.out.println("City: " + city);
    }
}

class Student {
    private String name;
    private int rollNumber;
    private String department;
    private University university; 

    public Student(String name, int rollNumber, String department, University university) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.university = university;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("University: " + university.getName() + ", " + university.getCity());
        System.out.println();
    }
}

// Main class
public class MainUniversity {
    public static void main(String[] args) {
        University university = new University("SVVV", "Indore");

        Student student1 = new Student("Vishvash Ame", 101, "Computer Application", university);
        Student student2 = new Student("Shrishti Jain", 102, "MBA", university);
        Student student3 = new Student("Nikki Dhakad", 103, "Bachelor's of Technology", university);

        System.out.println("Details of Students Enrolled:");
        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
    }
}
