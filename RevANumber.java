public class RevANumber {

    static int reverse(int n){

        int digits = (int)(Math.log10(n)+1);//formula to get no. of digits of in a number
        return helper(n,digits);
    }
    private static int helper(int n ,int digits){
        if( n%10 == n)//if only 1 no. left , return that no.( base condition)
        {
            return n;
        }
        int rem= n%10;// it will divide the no. and give the last digit

        // multiply last digit with the respictive power of 10 and recursively repeat funtion for every digit
        return  rem * (int) (Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {
        int n = 5678;
        int ans = reverse(n);
        System.out.println(ans);

    }
}
