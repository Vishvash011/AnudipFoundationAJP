package DayThree;

import java.util.Scanner;

public class StrongNumber {

    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int strong = num;
        int total = 0;
        while(num > 0){
            int rem = num % 10;
            total = total + factorial(rem);
            num = num / 10;
        }

        if(total == strong){
            System.out.println("Number is strong!");
        }
        else{
            System.out.println("Number is not strong");
        }
    }
}
