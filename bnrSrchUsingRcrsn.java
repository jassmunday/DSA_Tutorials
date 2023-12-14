public class bnrSrchUsingRcrsn {
    static int bsUsingRecursion (int [] arr , int target,int start ,int end ){
        if (start > end) {
            return -1;
        }
        int mid = start +(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (target<arr[mid]){
         return bsUsingRecursion(arr,target,start,mid-1);
        }
        return bsUsingRecursion(arr,target,mid+1, end);
        }

    public static void main(String[] args) {
        int[] arr = {3,5,47,56,78,83,95};
        int result = bsUsingRecursion(arr,56,0,arr.length-1);
        System.out.println(result);
    }
}
