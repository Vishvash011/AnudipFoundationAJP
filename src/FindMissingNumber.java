public class FindMissingNumber {
    public static int findMissingNumber(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == mid + 1){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return start + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};

        int result = findMissingNumber(arr);

        System.out.println(result);

    }
}
