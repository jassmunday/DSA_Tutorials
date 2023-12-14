public class linearSearch05 {


    static int  linearSearch (int [] arr , int trgt){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            int elemnt = arr[index];
            if(elemnt==trgt){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nmbrs = {19,45,55,38,67,24,89};
        int result = linearSearch(nmbrs,38);
        System.out.println(result);
    }
}
