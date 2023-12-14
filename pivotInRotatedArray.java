public class pivotInRotatedArray {
    static int search(int[] nums,int target){
        // this function to return the target number in array
        int pivot = findPivot(nums);
        System.out.println(pivot);

        int case1 = binarySearch(nums,target,0,pivot);
        int case2 = binarySearch(nums,target,pivot+1,nums.length-1);

        if (case1!=-1){
            return case1;
        }
        return case2;
    }

    static int findPivot(int[] nums){
        // not for array with duplicate values
        int start = 0;
        int end = nums.length-1;

       while (start<=end){
           //pivot is the biggest element from where the array is rotated
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
           // Case3 if middle element is less than the start then it means that array is rotated and
           // the bigger number lies in the right hand side {start -------- mid-1}
           if (nums[mid]<=nums[start]){
               // { 4, 5, 6, 0, 1, 2, 3 }
               end = mid-1;
           }
           // case4 if middle element is greater than start it means that the the bigger element
           // will be in left hand side {mid+1 ------------- end}
           else{
               start = mid+1;
           }
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
        int [] nums = {3,4,5,6,1,2};
        int target = 2;

        int testcase = search(nums,target);
        System.out.println(testcase);

    }
}
