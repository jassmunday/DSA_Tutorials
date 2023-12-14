public class SplitArray {
    static int splitArray(int [] nums,int k){
        int start = 0;
        int end = 0;
        // to get maximum sum and minimum sum as start and end respectively in splitting of array to find possible ans.

        for (int i = 0; i <nums.length ; i++) {
            start=Math.max(start,nums[i]);
            end = start +nums[i];
        }
        // binary search to get the other potential ans after splitting an array
        while (start<end){
            int mid = start+(end-start)/2;

            int sum = 0;
            int pieces = 1;
            //to find sum of array with no. of pieces we are doing
            for(int num :nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                // if pieces become more than m then ans must be greater than mid
                start=mid+1;
            }
            else {
                end = mid;
            }

        }
        return start;// or return end both of them will be equal in the end.
    }
    public static void main(String[] args) {

    }
}
