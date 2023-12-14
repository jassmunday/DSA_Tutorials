public class countRotation {

    static  int rotationCount(int [] array){
        int pivot = findPivot(array);
        return pivot+1;
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
            // Case3 if mid element is less than the start then it means that array is rotated and
            // the bigger number lies in the right hand side {start -------- mid-1}
            if (nums[mid]<=nums[start]){
                // { 4, 5, 6, 0, 1, 2, 3 }
                end = mid-1;
            }
            // case4 if if mid element is greater than start it means that the the bigger element
            // will be in left hand side {mid+1 ------------- end}
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,7,0,1,2};

        int result = rotationCount(arr);
        System.out.println(result);
    }
}
