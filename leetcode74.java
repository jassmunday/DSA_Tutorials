public class leetcode74 {
    public boolean search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binarySearch2d(matrix,0,0,cols-1,target);
        }

        int rStart =0;
        int rEnd = rows-1;
        int cMid = cols/2;
        // to reduce it to two rows
        while (rStart<(rEnd-1)){
            int mid = rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return true;
            }
            if(matrix[mid][cMid]<target){
                rStart=cMid;
            }
            else {
                rEnd=cMid;
            }

        }
        //now in remaining 2 rows
        // check the col 2 for first row mid , second(rStart+1) row mid
        if(matrix[rStart][cMid]==target){
            return true;
        }
        if(matrix[rStart+1][cMid]==target){
            return true;
        }

        //now 4 cases are left
        // case1
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch2d(matrix,rStart,0,cMid-1,target);
        }
        //case2
        if(target>=matrix[rStart][cMid+1]){
            return binarySearch2d(matrix,rStart,cMid+1,cols-1,target);
        }

        //case3
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch2d(matrix,rStart+1,0,cMid-1,target);
        }

        //case4
        else {
            return binarySearch2d(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
    public  boolean binarySearch2d(int [][] matrix,int row,int cStart,int cEnd,int target){
        //to find the middle column
        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]== target){
                return true;
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return false;
    }
}
