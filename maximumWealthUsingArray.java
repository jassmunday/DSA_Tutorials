import java.util.Arrays;

public class maximumWealthUsingArray {
//     public int maximumWealth(int[][] array){
//         int ans = Integer.MIN_VALUE;
//         for (int person = 0; person <array.length ; person++) {
//             int sum=0;
//             for (int accounts = 0; accounts < array[person].length; accounts++) {
//                 sum+=array[person][accounts];
//             }
//             if(ans<sum){
//                 ans=sum;
//             }
//         }
//         return ans;
//     }
      static int[] twoSum(int[] nums, int target) {
          for (int i = 0; i <nums.length ; i++) {
              for (int j = i+1; j < nums.length; j++) {
                  if(nums[i]+nums[j]==target){
                      return new int[] {i,j};
                  }
              }
          }
          return new int []{-1,-1};
      }
    public static void main(String[] args) {
          int [] nums = {3,4,2};
          int target = 5 ;
          int[] result = twoSum(nums,target);
          System.out.println(Arrays.toString(result));

     }
}
