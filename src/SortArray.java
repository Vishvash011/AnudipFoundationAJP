public class SortArray {
    public static void main(String[] args) {
        int arr[] = {12,45,65,21,35,11,9,67,97,29};

        // print the unsorted Original array
        for(int i : arr){
            System.out.print(i + " ");
        }

        bubbleSort(arr);

        // print the sorted array

        System.out.println();
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;

        // logic of bubble sort
        for (int i = 0; i < size - 1; i++) {
            boolean swap = false;
            for (int j = 0; j< size - i - 1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
