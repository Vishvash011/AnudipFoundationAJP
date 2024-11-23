import java.util.Arrays;

public class RotateArray {
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(array));
        rotateLeft(array, k);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }
}
