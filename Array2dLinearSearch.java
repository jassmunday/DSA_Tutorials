import java.util.Arrays;

public class Array2dLinearSearch {

    static int[] array2dSearch (int[][] arr , int trget){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==trget){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arrays={
                {34,45,67},
                {23,68},
                {1,5,3,8}
        };
        int trget = 68;
        int [] result=array2dSearch(arrays,trget);
        System.out.println(Arrays.toString(result));
    }
}
