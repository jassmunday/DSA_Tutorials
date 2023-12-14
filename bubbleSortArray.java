import java.util.Arrays;

public class bubbleSortArray {
    static void bubbleSort(int [] array){
        boolean isSwapped;
        for (int i = 0; i <array.length-1 ; i++) {
            isSwapped=false;
            //it will run the array for ith pass
            for (int j = 1; j < array.length-i; j++) {
                //
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }

    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
