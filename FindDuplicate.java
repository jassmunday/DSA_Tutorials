public class FindDuplicate {
    public int findDuplicate(int[] arr){
        int i=0;
        while (i< arr.length){
            if(arr[i]!=i+1){
                 int crct = arr[i]-1;
                 if(arr[i]!=arr[crct]){
                     swap(arr,i,crct);
                 }else{
                     return arr[i];
                 }
             } else {
                 i++;
             }
        }
        return -1;
    }
    public void swap(int [] arr,int one,int two){
        // to swap maximum number with last value
        int temp = arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public static void main(String[] args) {
        int [] arr ={3,1,2,4,2};
        //int ans = findDuplicate(arr);
       // System.out.println(ans);


    }
}
