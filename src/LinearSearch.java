public class LinearSearch {
    public static int linearSearch(int arr[], int target){
        // code to search an element

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,45,65,89,75,12,35,45};
        int target = 8;

        if(linearSearch(arr, target) == -1){
            System.out.println("Target element is not in arrays!");
        }
        else{
            System.out.println("Target element present in the index is : " + linearSearch(arr, target));
        }
    }
}
