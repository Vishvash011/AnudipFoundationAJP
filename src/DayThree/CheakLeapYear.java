package DayThree;

import java.util.Scanner;

public class CheakLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year number : ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("year " + year + " is a leap year");
        }
        else{
            System.out.println("year " + year + " is not a leap year");
        }
    }
}
