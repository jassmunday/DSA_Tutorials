public class sievePrime {
    static  int countPrimes(int n) {
        boolean [] primes = new boolean[n+1];
        return sievePrimeTheorem(n,primes);

    }
    static int sievePrimeTheorem(int n,boolean[] primes){
        for (int i = 2; i*i <= n ; i++) {
            if(!primes[i])//at first every number is false
            {
                for (int j = i*2; j <= n ; j+=i) // at this we have declared the multiples of i true( means not prime)
                {
                    primes[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(!primes[i]) {
               // System.out.print(i + " ");
                count++;
            }
        }
        //System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int n = 50;
        countPrimes(n);
    }
}
