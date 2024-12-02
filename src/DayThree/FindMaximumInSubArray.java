package DayThree;

public class FindMaximumInSubArray {

    public static int findMaxInSubArray(int[] arr, int start, int end){

        if(arr.length <= 2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=start; i<=end; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(secondMax < arr[i] && arr[i] != max){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,6,7,9,4,5,6};
        int end = 6;
        int start = 2;

        int result = findMaxInSubArray(arr, start, end);

        if(result != -1){
            System.out.println("second max element in sub arrays is : " + result);
        }
        else{
            System.out.println("array must have more than two elements");
        }
    }
}
