public class FindPairToGivenSum {

    public static void findPairs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int currentSum = arr[start] + arr[end];

            if(currentSum == target){
                System.out.println("Pair found : (" + arr[start] + ", " + arr[end] + ")");
                return;
            }
            else if(currentSum < target){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println("No pair found!");
    }

    public static void main(String[] args) {
        int arr[] = {5,7,9,12,45,65,89,81,23,69};
        int target = 134;

        findPairs(arr, target);

    }
}
