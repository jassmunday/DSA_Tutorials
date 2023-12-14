public class firstAndLastElementleetCode34 {
    // function to return first and last element in form of array
    public int[] searchRange(int[] nums, int target) {
        int [] ans ={-1,-1};
        int start = Search(nums,target,true);
        int end  = Search(nums,target,false);
        ans[0]=start;
        ans[1]= end;
        return ans;
    }
    public int Search(int[] nums, int target,boolean firstElement){
        // function to find the occurance of target in array
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;
            }
            else{
                // one answer is found it may or may not be first or last element
                ans = mid;
                if(firstElement){
                    // to check element in left side
                    end = mid-1;
                }
                else {
                    // to check element in right side
                    start = mid+1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
