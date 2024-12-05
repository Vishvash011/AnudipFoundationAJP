import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {

        int num1, num2;

        // Create a Scanner object for reading input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 and num2: ");

        // Read the two numbers from user input
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // Use the ternary operator to determine the maximum of the two numbers
        int max = (num1 > num2) ? num1 : num2;

        // Display the maximum number to the user
        System.out.println("Maximum number is: " + max);
    }
}
