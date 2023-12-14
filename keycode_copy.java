public class keycode_copy {
    public static int orderAgnosticBS(int[]arr, int key){
        int start = 0 ; int end = arr.length-1;
        if(arr[start]<arr[end]){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(key>arr[mid]){
                    start = mid+1;
                    System.out.println("ascending loop");
                }
                else {
                    end = mid - 1;
                }

            }
        }
        else if(arr[start]>arr[end]){
            while(start<=end){
                int mid = start+(end-start)/2;
                if (arr[mid]==key){
                    return mid;
                } else if (key<arr[mid]) {
                    start = mid+1;
                }
                else {
                    end = mid -1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]array = {9,8,7,6,4,2,1};
        int[]ar = {1,2,4,6,10,18,19};
        int result = orderAgnosticBS(array,7);
        int res = orderAgnosticBS(ar,10);
        System.out.println(result);
        System.out.println(res);
    }
}