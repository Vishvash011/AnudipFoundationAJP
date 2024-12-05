//Write a program to check whether a number is a Strong number or not.
// Strong number is a special number whose sum of factorial of digits is equal to the original number.
// For example: 145 is a strong number. Since, 1! + 4! + 5! = 145.

package DayThree;

import java.util.Scanner;

// Class to check if a given number is a Strong Number
public class StrongNumber {

    // Method to calculate the factorial of a number
    public static int factorial(int num) {
        // Base cases: factorial of 0 or 1 is 1
        if (num == 0 || num == 1) {
            return 1;
        }
        // Recursive call to calculate factorial
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Store the original number to compare later
        int originalNumber = num;

        // Variable to store the sum of factorials of digits
        int sum = 0;

        // Loop to process each digit of the number
        while (num > 0) {
            int rem = num % 10; // Extract the last digit
            sum = sum + factorial(rem); // Add the factorial of the digit to the sum
            num = num / 10; // Remove the last digit
        }

        // Check if the sum of factorials of digits equals the original number
        if (sum == originalNumber) {
            System.out.println("Number is strong!"); // If yes, it's a strong number
        } else {
            System.out.println("Number is not strong"); // Otherwise, it's not a strong number
        }
    }
}
