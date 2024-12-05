package DataStructure;


public class QuickSort {

    public static int partition(int[] arr, int start, int end){

        int pivotIndex = start;
        int pivotElement = arr[start];

        int count = 0;

        for(int i=start + 1; i<=end; i++){
            if(pivotElement >= arr[i]){
                count++;
            }
        }

        int rightIndex = start + count;

        int temp = arr[rightIndex];
        arr[rightIndex] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        pivotIndex = rightIndex;

        int i = start;
        int j = end;

        while(i < pivotIndex && j > pivotIndex){
            while(arr[i] <= pivotElement){
                i++;
            }
            while(arr[j] > pivotElement){
                j--;
            }

            if(i < pivotIndex && j > pivotIndex) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int[] arr, int start, int end){

        if(start >= end){
            return ;
        }

        int index = partition(arr, start, end);

        quickSort(arr,start, index - 1);

        quickSort(arr, index + 1, end);
    }
    public static void main(String[] args) {
        int[] arr = {6,1,20,30,8,5,60,5};
        int start = 0;
        int end = arr.length - 1;

        quickSort(arr, start, end);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
