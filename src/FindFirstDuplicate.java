public class FindFirstDuplicate {

    public static int findFirstDuplicate(int[] arr){
        for(int i : arr){
            for(int j=0; j<i; j++){
                if(i == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,3,4,2,6};

        int result = findFirstDuplicate(arr);

        if(result != -1){
            System.out.println("First duplicate is : " + result);
        }
        else{
            System.out.println("No duplicates found");
        }

    }
}
