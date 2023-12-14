public class zerosInANumber {
    /*static int count(int n){

        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if (n==0){
            return count;
        }

        int rem = n%10;
        if (rem == 0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }

     */
    public int noOfSteps(int n){
        return helper(n,0);
    }
    private static int helper(int num , int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return  helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }

    public static void main(String[] args) {
        //int n = 345005;
        //int ans = count(n);
        //System.out.println(ans);
    }
}
