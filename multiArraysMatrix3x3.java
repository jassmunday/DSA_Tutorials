import java.util.Scanner;

public class multiArraysMatrix3x3 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array:");

        for (int row = 0;row<arr.length;row++){
            // for column
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]= sc.nextInt();
            }
        }
        for (int row = 0;row<arr.length;row++){
            // for column
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
