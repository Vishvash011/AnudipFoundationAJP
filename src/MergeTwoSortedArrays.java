public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = {6,7,8,9,10};
        int size = arr.length + brr.length;
        int[] unionArr = new int[size];

        int k = 0;
        for (int j : arr) {
            unionArr[k] = j;
            k++;
        }

        for (int value : brr) {
            unionArr[k] = value;
            k++;
        }

        // print merge sorted array

        for(int i : unionArr){
            System.out.print(i + " ");
        }
    }
}
