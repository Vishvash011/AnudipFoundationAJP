package DataStructure;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int s, int e) {
        int mid = s + (e - s) / 2;

        // Lengths of the two subarrays
        int len1 = mid - s + 1;
        int len2 = e - mid;

        // Create temporary arrays for left and right
        int[] left = new int[len1];
        int[] right = new int[len2];

        // Copy data to temporary arrays
        for (int i = 0; i < len1; i++) {
            left[i] = arr[s + i];
        }
        for (int i = 0; i < len2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Merge the temporary arrays back into the original array
        int leftIndex = 0, rightIndex = 0, mainArrayIndex = s;

        while (leftIndex < len1 && rightIndex < len2) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[mainArrayIndex] = left[leftIndex];
                leftIndex++;
            } else {
                arr[mainArrayIndex] = right[rightIndex];
                rightIndex++;
            }
            mainArrayIndex++;
        }

        // Copy remaining elements of left[], if any
        while (leftIndex < len1) {
            arr[mainArrayIndex] = left[leftIndex];
            leftIndex++;
            mainArrayIndex++;
        }

        // Copy remaining elements of right[], if any
        while (rightIndex < len2) {
            arr[mainArrayIndex] = right[rightIndex];
            rightIndex++;
            mainArrayIndex++;
        }
    }

    public static void mergeSort(int[] arr, int s, int e) {
        // Base case: single element or invalid array
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;

        // Sort the left half
        mergeSort(arr, s, mid);

        // Sort the right half
        mergeSort(arr, mid + 1, e);

        // Merge the sorted halves
        merge(arr, s, e);
    }

    public static void main(String[] args) {
        int[] arr = {15, 4, 5, 13, 2, 12, 1};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}

