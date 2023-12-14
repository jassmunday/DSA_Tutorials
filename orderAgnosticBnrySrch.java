public class orderAgnosticBnrySrch {
    static int orderAgnosticBS(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsec = arr[start]<arr[end];

        while(start<=end){

            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAsec){
                if (target<arr[mid]){
                    end=mid-1;
                } else {
                    start = mid+1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        //int [] arr ={-12,-7,-2,0,3,5,8,9,14,17,22,25};
        int[] arr = {90,56,45,18,13,10,3,1,0,-9,-73};
        int target=18;

        int result = orderAgnosticBS(arr,target);
        System.out.println(result);

    }
}
