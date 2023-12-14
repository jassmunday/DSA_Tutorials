public class findElementInMountainArray {
    static  int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry= orderAgnosticBS(arr,target,0,peak);
        int nextTry= orderAgnosticBS(arr,target,peak+1,arr.length-1);
        if(firstTry!= -1){
            return firstTry;
        }
        return nextTry;
    }
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
    static int orderAgnosticBS(int [] arr,int target,int start, int end){
        int mid = start+(end-start)/2;
        boolean isAsec =arr[start]<arr[end];
        if(arr[mid]==target){
            return mid;
        }
        if(isAsec){
            if(arr[mid]>target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        else {
            if(arr[mid]<target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
