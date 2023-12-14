import java.util.Arrays;

public class QuickSort {
    static void sort(int [] arr , int low , int hi){

        if(low>=hi){
            return ;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            //to move forward if start is already less than pivot and end is greater than pivot Or.....
            //to skip if the array is already sorted
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            // to sort array to take the pivot to its right index
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        // now pivot is at right index.
        sort(arr,low ,e);
        sort (arr,s,hi);

    }
    public static void main(String[] args) {
        int[] arr ={98,45,76,32,13,94};
        System.out.println("BEFORE SORTING : "+ Arrays.toString(arr));
        sort(arr,0, arr.length-1);
        System.out.println("AFTER SORTING : "+Arrays.toString(arr));

    }
}
