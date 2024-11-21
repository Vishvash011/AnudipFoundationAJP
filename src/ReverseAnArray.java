import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = arr.length;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the elements of an arrays: ");
        // taking an array element from the user
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // logic of reversing an array
        int start = 0;
        int end = size - 1;

        while(start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // printing the reverse array
        System.out.print("printing the reverse array : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
