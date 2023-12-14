public class ArraySortedOrNot {

    static boolean sortedArray(int[] arr ,int index){
        if(index == arr.length-1 ){
            return true;
        }
        return arr[index]<arr[index+1] && sortedArray(arr,index+1);
    }

    static int linearSearchRecursion(int [] array,int target ,int indx){
        if(array[indx] == array.length-1){
            return -1;
        }
        if(array[indx] == target){
            return indx;
        }else{
        return linearSearchRecursion(array,target,indx+1);
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,79,52};
        int target = 7;
        System.out.println(linearSearchRecursion(arr,target,0));
    }

}
