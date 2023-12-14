public class infiniteArraySearch {
    static  int ans (int [] arr , int target){
        int start=0;
        int end=1;

        while (target>arr[end])
        {
            int nuStart=end+1;
            end = end +(end-start+1)*2;
            start = nuStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start,int end){


        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                target=arr[mid];
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99,100,111,222,333,444,555,666,777,888,999,1000};
        int target = 77;

        int result = ans(arr,target);
        System.out.println(result);

    }
}
