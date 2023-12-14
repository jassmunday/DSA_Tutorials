public class leetcode268 {
    public int missingNumber(int[] arr){
            int i =0;
            while(i<arr.length){
                int Correct = arr[i];
                if(arr[i]< arr.length && arr[i]!=arr[Correct]){
                    swap(arr,i,Correct);
                }
                else{
                    i++;
                }
            }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    public void swap(int [] arr,int one,int two){
        // to swap maximum number with last value
        int temp = arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public static void main(String[] args) {

    }
}
