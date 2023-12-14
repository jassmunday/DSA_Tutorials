import java.util.Arrays;
public class CyclicSort {
    static void cyclicSort(int [] arr){
        int i =0;
        while(i<arr.length){
            int Correct = arr[i]-1;
            if(arr[i]!=arr[Correct]){
                selectionSort.swap(arr,i,Correct);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,3,2,4,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
