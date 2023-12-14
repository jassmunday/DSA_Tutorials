import java.util.ArrayList;

public class BinarySearchTree {
    public static class Node{
        int data ;
        Node left ;
        Node right;
        Node(int data ){
            this.data = data;
            this.left=null;
            this.right = null;
        }

    }
    public static Node insert(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.data>value){
            root.left = insert(root.left,value);
        }
        else{
            root.right= insert(root.right,value);
        }
        return root;
    }
    public void inorder(Node root ){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+"-");
        inorder(root.right);
    }
    public static void printInRange(Node root , int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.println(root.data+" ");
            printInRange(root.right,k1,k2);
        } else if (root.data < k1) {
            printInRange(root.left,k1,k2);//printInRange(root.left,k1,k2);//[DOUBT]//
        }else{
            printInRange(root.right,k1,k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size()-1 ; i++) {
            System.out.println(path.get(i));
        }
    }
    public static void path2Leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printPath(path);
        }
        path2Leaf(root.left,path);
        path2Leaf(root.right,path);
        path.remove(path.size()-1);

    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if( min!=null && root.data<= min.data){
            return false;
        }
        if( max!=null && root.data>= max.data){
            return false;
        }

        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    //public static Node createBSTFromArray(int[] arr,int s,int e){}
    public static class  Info{
        boolean isValid;
        int size;
        int  min;
        int max;
        Info(boolean isValid,int size,int min,int max){
            this.isValid=isValid;
            this.size=size;
            this.min = min;
            this.max= max;
        }
    }
    public static int maxBST=0;
    public static Info largestBST(Node root)//To find largest BST in BT
    {
        if(root==null){
            return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        Info leftInfo = largestBST(root.left);//take info from left
        Info rightInfo = largestBST(root.right);//take info from right
        int size = leftInfo.size+ rightInfo.size+1;//assign the size for checking
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));//find min value for thr crnt node
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));//find max

        if(root.data<= leftInfo.max||root.data>= rightInfo.min){
            return new Info(false,size,min,max);//false condition
        }
        if(leftInfo.isValid&rightInfo.isValid){// check it is valid bst or not
            maxBST = Math.max(maxBST,size);//check size os max. bst
            return new Info(true,size,min,max);//true condition
        }
        return new Info(false,size,min,max);//return false if not


    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }

    }
}
