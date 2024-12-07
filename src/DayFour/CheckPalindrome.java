package DayFour;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";

        // Variables to hold the starting and ending indices of the string
        int start = 0;
        int end = str.length() - 1;

        // Boolean flag to track whether the string is a palindrome
        boolean isPalindrome = true;

        // Loop to check characters from the start and end of the string
        while (start < end) {
            // If characters at the current positions do not match, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false; // Set flag to false
                break; // Exit the loop as it's confirmed not a palindrome
            }
            start++;
            end--;
        }

        // Check the flag and print the appropriate message
        if (isPalindrome) {
            System.out.println(str + " is a palindrome!"); // If true, it's a palindrome
        } else {
            System.out.println(str + " is not a palindrome."); // Otherwise, it's not
        }
    }
}
