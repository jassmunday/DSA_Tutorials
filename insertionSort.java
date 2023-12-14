import java.util.Arrays;

public class insertionSort {
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {// or use i<=arr.length-2
            for (int j = i+1; j >=1 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int [] arr,int one,int two){
        // to swap maximum number with last value
        int temp = arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public static void main(String[] args) {
        int [] arr = {78,45,67,22,15};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
