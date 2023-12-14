public class peakIndexInMountainArray13 {
    static int peakIndexInMountainArray(int [] arr ){
        int start =0;
        int end = arr.length-1;

        while (start<end){
            int mid  = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // we are on decreasing side 5(m), 4, 3,
                end=mid;
            }
            else{
                // we are on increasing side 4, 5(m), 6 etc.
                start = mid+1;
            }
        }
        return start;// or we can also return end because they both will become equal due to the above condition
                     //in the end they both will point to the maximum element in array

    }

    public static void main(String[] args) {
        int [] arr = {0,1,0};
        int result = peakIndexInMountainArray(arr);
        System.out.println(result);

    }
}
