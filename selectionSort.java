import java.util.Arrays;

public class selectionSort {
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;//the last index of array to which the maximum value is swapped
            int maxValue=getMaxValue(arr,0,last);
            swap(arr,maxValue,last);
        }
    }
    static void swap(int [] arr,int one,int two){
        // to swap maximum number with last value
        int temp = arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    static int getMaxValue(int [] arr,int start,int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
