package BinaryTree;

public class getlevel {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public int levelat(Node node,int value,int lev){
        //base case
        if(node==null){
            return -1;
        }
        if(node.data==value){
            return lev;
        }
        //search for left side
        int l=levelat(node.left,value,lev+1);
        if(l!=-1){
            return l;
        }
        //else it present in right tree
        return levelat(node.right,value,lev+1);

    }

    public static void main(String[] args) {
        getlevel tt=new getlevel();
        // Creating a sample binary tree:
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  5 6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        System.out.println(tt.levelat(root,7,1));
    }
}
