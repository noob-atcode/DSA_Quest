package BinaryTree;

public class Perfectbinarytree {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public int depth(Node node){
        if(node==null){
            return 0;
        }
        return (Math.max(depth(node.left),depth(node.right)))+1;
    }
    public boolean Isbinarytree(Node node,int d){
        //if root is null
        if(node==null){
            return true;
        }
        //task has to find is my internal nodes having child
        if(node.left==null&& node.right==null){
            return d==1;
        }
        //if internal node not having child
        if(node.left==null ||node.right==null){
            return false;
        }
       return Isbinarytree(node.left,d-1) && Isbinarytree(node.right,d-1);
    }
    public boolean isperfect(Node root){
        int d=depth(root);
      return  Isbinarytree(root,d);
    }

    public static void main(String[] args) {
        Perfectbinarytree tt=new Perfectbinarytree();
        // Binary tree
        //           10
        //        /     \
        //      20       30
        //     /  \     /  \
        //   40    50  60   70
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
//        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        System.out.println(tt.isperfect(root));
    }
}
