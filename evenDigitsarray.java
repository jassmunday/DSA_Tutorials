public class evenDigitsarray {

     static int findNumber(int[]arr){
         int count=0;
         for (int element: arr) {
             if(even(element)){
                 count++;
             }
         }
         return count;
     }

     //to find it is even or not
     static boolean even(int num){
         int noOfDigits = digits(num);
         return noOfDigits%2==0;
     }

     //to find even digits
      static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
     }
    public static void main(String[] args) {

    }
}
