import java.util.Arrays;

public class patternRecursion {
    static void pattern(int r ,int c){
        if (r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            pattern(r,c+1);
        }
        else{
            System.out.println();
            pattern(r-1,0);
        }
    }
    static void bubbleSortRecursion(int[]arr,int r ,int c){
        if (r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]= arr[c+1];
                arr[c+1]= temp;
            }
            bubbleSortRecursion(arr,r,c+1);
        }
        else{
            bubbleSortRecursion(arr,r-1,0);
        }
    }
    static void selectionSortRecursion(int[]arr,int r ,int c,int max){
        if (r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[max]){
                selectionSortRecursion(arr,r,c+1,c);
            }
            else {
                selectionSortRecursion(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max]= arr[r-1];
            arr[r-1]= temp;
            selectionSortRecursion(arr,r-1,0,0);
        }
    }

    public static void main(String[] args) {
        //pattern(5,0);
        int [] arr = {5,2,1,3,7};
        //bubbleSortRecursion(arr, arr.length-1,0 );
        //System.out.println(Arrays.toString(arr));

        selectionSortRecursion(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
