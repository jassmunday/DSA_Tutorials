public class pivotInRotatedArrayInDuplicateValus {
    static int search(int[] nums,int target){
        // this function to return the target number in array
        int pivot = findPivotInDuplicateArray(nums);

        int case1 = binarySearch(nums,target,0,pivot);
        int case2 = binarySearch(nums,target,pivot+1,nums.length-1);

        if (case1!=-1){
            return case1;
        }
        return case2;
    }

    static int findPivotInDuplicateArray(int[] nums){
        // for array with duplicate values
        //pivot is the biggest element from where the array is rotated
        int start = 0;
        int end = nums.length-1;
        int mid  = start +(end-start)/2;
        // Case1 if mid is greater than the next element then mid is pivot( greatest element).
        //mid should not be the last element because then mid+1 will be array index out of bound
        if (mid<end && nums[mid]>nums[mid+1] ){
            return mid;
        }
        // Case 2 if mid is less than the previous element than the previous element is mid.
        //start should not be mid it will give array out of bound because no element is less than start
        if (mid>start && nums[mid]<nums[mid-1]){
            return mid-1;
        }

        if(nums[start]==nums[mid] && nums[mid]==nums[end]){
            if(nums[start]>nums[start+1]){
                return start;
            }
            start++;

            if(nums[end-1]>nums[end]){
                return end-1;
            }
            end--;
        }
        // search in right side
        else if (nums[start] < nums[mid] || nums[start]==nums[mid]&& nums[mid]>nums[end]) {
            start=mid+1;
        }
        // search in left side
        else {
            end = mid-1;
        }

        return -1;
    }
    static int binarySearch(int[] arr, int target,int start,int end){
        // this function to do normal binary search with the help of pivot to find the target element

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

    }
}
