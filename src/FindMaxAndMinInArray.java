public class FindMaxAndMinInArray {
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        // logic to find maximum value in array
        for(int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        // logic to find minimum value in array
        for(int i=0; i<arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40,45,50};

        int maximum = findMax(arr);
        int minimum = findMin(arr);

        System.out.println("Maximum element in array is : " + maximum + " and minimum is : " + minimum);

    }
}
