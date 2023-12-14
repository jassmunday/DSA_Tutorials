import javax.swing.tree.TreeCellRenderer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

public class binaryTrees {
     static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int ind = -1 ;

        static TreeNode buildTree(int [] nodes){
            ind++;
            if(nodes[ind]==-1){
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(TreeNode root){
         if(root==null){
             return;
         }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void levelOrder(TreeNode root){
         if(root==null){
             return;
         }

        Queue<TreeNode> que = new LinkedList<>();
         que.add(root);
         que.add(null);

         while(!que.isEmpty()){
             TreeNode crntNode = que.remove();
             if(crntNode==null){
                 if(que.isEmpty()){
                     break;
                 } else{
                     que.add(null);
                 }
             }
             else{
                 System.out.println(crntNode.data+" ");
                 if(crntNode.left!=null){
                     que.add(crntNode.left);
                 }
                 if(crntNode.right!=null){
                     que.add(crntNode.right);
                 }
             }
         }
    }
    public class info{
         TreeNode node;
         int hd; //distance that gives the value seen from the top using the root noode horizontal distance that is 0

        public info(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public  void topView(TreeNode root){
         Queue<info> qu = new LinkedList<>();
        HashMap<Integer,TreeNode> map = new HashMap<>();
        int min=0; int max=0;
        qu.add(new info(root,0));
        qu.add(null);
        while(!qu.isEmpty()){
            info crnt = qu.remove();
            if(crnt==null){
                if(qu.isEmpty()){
                    break;
                } else{
                    qu.add(null);
                }
            }else {
                if(!map.containsKey(crnt.hd)){
                    map.put(crnt.hd,crnt.node);
                }
                if(crnt.node.left!=null){
                    qu.add(new info(crnt.node.left,crnt.hd-1));
                    min=Math.min(min,crnt.hd-1);
                }
                if(crnt.node.right!=null){
                    qu.add(new info(crnt.node.right,crnt.hd+1));
                    max=Math.max(max,crnt.hd+1);
                }

            }


            for (int i = min; i <=max ; i++) {
                System.out.println(map.get(i).data);
            }
        }

    }
    public int  sumOfNodes(TreeNode root){
         if(root==null){
             return 0;
         }

         int leftSum = sumOfNodes(root.left);
         int rightSum = sumOfNodes(root.right);

          return leftSum + rightSum + root.data;
    }
    public int  hieght (TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHieght = hieght(root.left);
        int rightHieght= hieght(root.right);

        return leftHieght + rightHieght + 1;
    }
    public int diameterOfATree (TreeNode root){
        if(root==null){
            return 0;
        }
        int diam1= diameterOfATree(root.left);
        int diam2= diameterOfATree(root.right);
        int diam3=hieght(root.left) + hieght(root.right)+1;

        return Math.max(Math.max(diam3,diam2),diam3);
    }

    public void kLevel(TreeNode root,int level,int k){
        if(root==null){
            return ;
        }
        if(level==k){
            System.out.println(root.data);
        }
        kLevel(root.left,level+1,k);
        kLevel(root.right,level+1,k);
    }
   public boolean getPath(TreeNode root,int n,ArrayList<TreeNode> path){
        if(root==null){
             return false;
        }
       path.add(root);

       boolean foundLeft = getPath(root.left,n,path);
       boolean foundRight = getPath(root.left,n,path);
       if(foundLeft||foundRight){
           return true;
       }

       path.remove(path.size()-1);
       return false;
   }
    public TreeNode lca(TreeNode root,int n1,int n2){
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n1,path1);
        int i=0;
        for ( i = i; i < path1.size() &&i< path2.size() ; i++) {
            if (path1.get(i)!=path2.get(i)) {
                break;
            }

        }
        TreeNode lca = path1.get(i-1);
        return  lca ;
    }
    public TreeNode lcaRcrsn2(TreeNode root,int n1,int n2){
        if(root==null|| root.data==n1 ||root.data==n2){
            return root;
        }

        TreeNode leftLca = lcaRcrsn2(root.left,n1,n2);
        TreeNode rightLca = lcaRcrsn2(root.right,n1,n2);
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }

        return root;//when both values from left and right hasn't come null it means that root
        // is their least  nearest common ancesstor
    }
    //kth Ancestor question
    public int KAncestor(TreeNode root,int k,int n){
         if(root.data==n){
             return 0;
         }
         int leftDist = KAncestor(root.left,k,n);
         int rightDist = KAncestor(root.right,k,n);
         if(leftDist==-1&&rightDist==-1){
             return -1;
         }

         int max = Math.max(leftDist,rightDist);
         if(max+1==k){
             System.out.println(root.data);
         }

         return max+1;

    }



    public static void main(String[] args) {
        int [] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        TreeNode root=tree.buildTree(nodes);
        System.out.println(root.data);

    }
}
