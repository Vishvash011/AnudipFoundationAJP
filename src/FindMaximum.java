import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1 and num2 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number is : " + max);
    }
}
