public class RemoveDuplicate {
    public static int removeDuplicate(int arr[]){
        int size = arr.length;

        int index = 0;

        for(int i=0; i<size; i++){
            boolean isDuplicate = false;

            for(int j=0; j<index; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,6,7,8,8};

        int uniqueCount = removeDuplicate(arr);

        System.out.print("Arrays after removing duplicates : ");
        for(int i=0; i<uniqueCount; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
