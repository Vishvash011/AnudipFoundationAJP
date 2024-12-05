package DataStructure;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int[] brr = {2, 4, 6, 8, 10};

        int arrSize = arr.length;
        int brrSize = brr.length;

        int[] sortedArray = new int[arrSize + brrSize];

        int i = 0, j = 0, k = 0;

        while (i < arrSize && j < brrSize) {
            if (arr[i] < brr[j]) {
                sortedArray[k++] = arr[i++];
            } else {
                sortedArray[k++] = brr[j++];
            }
        }

        while (i < arrSize) {
            sortedArray[k++] = arr[i++];
        }

        while (j < brrSize) {
            sortedArray[k++] = brr[j++];
        }

        // Printing the sorted array
        System.out.println(Arrays.toString(sortedArray));
    }
}
