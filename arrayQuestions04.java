import java.util.Arrays;

public class arrayQuestions04 {
    static void swap (int [] arr1,int indx1,int indx2){
        int temp = arr1[indx1];
        arr1[indx1]= arr1[indx2];
        arr1[indx2]=temp;
    }
//    static int max (int[] arr){
//        int maxVlu= arr[0];
//        for (int a = 0; a < arr.length; a++) {
//            if (arr[a]>maxVlu){
//                maxVlu =arr[a];
//            }
//        }
//        return maxVlu;
//    }



    // q3 reverse an array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        //q2 max number of array
        int[] arr = {35, 67,7,17};
        //System.out.println(max(arr));



        //q1swap numbers
//        int[] arr1 = {35, 67,78,17};
//        System.out.println(Arrays.toString(arr1));
//        swap(arr1,0,3);
//        System.out.println(Arrays.toString(arr1));


        // reverse an array
          reverse(arr);
          System.out.println(Arrays.toString(arr));



    }
}
