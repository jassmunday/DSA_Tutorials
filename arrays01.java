import java.util.Arrays;
import java.util.Scanner;
public class arrays01 {
    public static void main(String[] args) {
       int arrayName[]= new int[4];
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the array:");
       for (int i=0;i<arrayName.length;i++){
           arrayName[i]= sc.nextInt();
       }
        for (int i=0;i<arrayName.length;i++){
            System.out.print(arrayName[i]+" ");
        }
        // we can use toString method of arrays class to print elements of array
        System.out.println(Arrays.toString(arrayName));
    }
}
