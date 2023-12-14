public class cielingOfANumber {

    static int cielingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsec = arr[start]<arr[end];

        while(start<=end){

            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAsec){
                if (target<arr[mid]){
                    end=mid-1;
                } else {
                    start = mid+1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }

        }
        return start;
    }
    public static void main(String[] args) {
        int [] arr ={-12,-7,-2,0,3,5,8,9,14,17,22,25};
        int target=15;

        int result = cielingNumber(arr,target);
        System.out.println(result);


    }
}
