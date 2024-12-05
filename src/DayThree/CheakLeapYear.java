//Write a program to check leap year using if else. How to check whether a given year is a leap year or not.
// [Hint:Take an input of any number. Store it in some variable say year.
// If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year.
// Or if a year is exactly divisible by 400 then it is a leap year.]

package DayThree;

import java.util.Scanner;

// Class to check whether a given year is a leap year
public class CheakLeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter any year number: ");
        int year = sc.nextInt(); // Read the year entered by the user

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            // If the year is divisible by 4 and not divisible by 100, or it is divisible by 400
            System.out.println("Year " + year + " is a leap year");
        } else {
            // If the year does not satisfy the leap year conditions
            System.out.println("Year " + year + " is not a leap year");
        }

        // Close the Scanner object
        sc.close();
    }
}

