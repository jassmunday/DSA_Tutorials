import java.util.Scanner;

public class binarySearch08 {

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={-12,-7,-2,0,3,5,8,9,14,17,22,25};
        System.out.println("Enter the No : ");
        Scanner sc = new Scanner(System.in);
        int trgt = sc.nextInt();


        int result = binarySearch(arr,trgt);
        System.out.println("The number you are searching is at the index : "+result);

    }
}
