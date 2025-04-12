package BinaryTree;

public class Findcousin {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public  boolean ISsibling(Node node,int a,int b){
        //cond for rrot s null
        if(node==null){
            return false;
        }
        if(node.left!=null && node.right!=null && node.left.data==a && node.right.data==b){
            return  true;
        }
        if(node.left!=null && node.right!=null && node.left.data==b && node.right.data==a){
            return  true;
        }
       return ISsibling(node.left,a,b)||ISsibling(node.right,a,b);

    }
    public int level(Node node,int value,int lev){
        //Base case
     if(node==null){
         return 0;
     }

     if(node.data==value){
         return lev;
     }
     int l=level(node.left,value,lev+1);
     if(l!=0){
         return l;
     }

     //else it has to be in right side
        return level(node.right,value,lev+1);
    }
    public boolean iscousin(Node node,int a,int b){
        if(a==b){
            return false;
        }
        int alevel=level(node,a,1);
        int blevel=level(node,b,1);

        // if a or b does not exist in the tree
        if (alevel == 0 || blevel == 0)
            return false;

        return alevel==blevel && !ISsibling(node,a,b);
    }

    public static void main(String[] args) {
        Findcousin tt=new Findcousin();
        // create hard coded tree
        //       1
        //     /   \
        //    2     3
        //   /       \
        //  5         4
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int a = 4, b = 5;
        if(tt.iscousin(root,a,b)){
            System.out.println("yes cousin");
        }else{
            System.out.println("Nope");
        }
    }
}
