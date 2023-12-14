public class linearSearchQuestions {


    static int  linearSearch (int [] arr , int trgt,int start , int end){
        // Q search in range
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index <end; index++) {
            int elemnt = arr[index];
            if(elemnt==trgt){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Q. Search in range
        int [] nmbrs = {19,45,55,38,67,24,89};
        int result = linearSearch(nmbrs,45,2,5);
        System.out.println(result);
    }
}
