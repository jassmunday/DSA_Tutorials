import java.util.Arrays;

public class arrays02 {
    static void change(int[] arr){
        arr[0]=89;
    }
    public static void main(String[] args) {
        int num[]= new int[4];
        num[0]=45;
        num[1]=63;
        num[2]=75;
        num[3]=49;
        System.out.println(Arrays.toString(num));
        // if we change the copy of the array it will change the original value of array
        // arrays are mutable
        change(num);
        System.out.println(Arrays.toString(num));

    }
}
