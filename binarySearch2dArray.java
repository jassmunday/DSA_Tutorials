import java.util.Arrays;

public class binarySearch2dArray {
    static  int [] binarySearch2d(int [][] matrix,int target){
        int r = 0;
        int c = matrix.length-1;
        while (r< matrix.length && c>=0){
            if(matrix[r][c]== target){
                return new int []{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arr ={
            {13,14,15,19},
            {21,24,29,30},
            {31,33,35,38},
            {42,45,47,50}
        };
        int target = 38;

        int[] result = binarySearch2d(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
