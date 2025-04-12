package BinaryTree;

public class Mirrortree {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public boolean aremirror(Node node1,Node node2){
        //if both root is empty
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        //3 check points

        return (node1.data==node2.data) && aremirror(node1.left,node2.right) && aremirror(node1.right,node2.left);

    }

    public static void main(String[] args) {
        Mirrortree tt=new Mirrortree();
        // Representation of input binary tree 1
        //        1
        //       / \
        //      3   2
        //          / \
        //         5   4
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);

        // Representation of input binary tree 2 (mirror)
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        if(tt.aremirror(root1,root2)){
            System.out.println("Yeep");
        }else{
            System.out.println("Nope");
        }
    }

}
