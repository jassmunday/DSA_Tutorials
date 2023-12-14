import java.util.Arrays;

public class mergesortinplace {
    static void  mergeSortInPlace(int [] arr){
        if(arr.length == 1){
        }
        int mid = arr.length/2;//mid of the no. of elements in array

        // recursively applying merge sort on current left array
        // int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));

        //int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        //return merge(left,right);
    }

    private static int[] merge(int [] first,int [] second){

        int[] mrgAry = new int[first.length + second.length ];

        int f = 0 ;//pointer for first array
        int s = 0 ;//pointing to current element on second array
        int m = 0 ;//pointer for merged array of first and second

        //when both array are of same size
        while(f < first.length && s <second.length){
            if (first[f]<second[s]) {
                mrgAry[m]=first[f];
                f++;
            }
            else {
                mrgAry[m]=second[s];
                s++;
            }
            m++;
        }
        //when first array is bigger than other array
        while ( f < first.length){
            mrgAry[m]=first[f];
            f++;
            m++;
        }
        //when second  array is bigger than other array
        while ( s< second.length){
            mrgAry[m]=second[s];
            s++;
            m++;
        }

        return mrgAry;
    }

    public static void main(String[] args) {
        int[] arr ={6,5,4,3,2,1};
       // arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
