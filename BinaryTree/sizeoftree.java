//package BinaryTree;
//class Node {
//    int data;
//    Node left, right;
//
//    Node(int x) {
//        data = x;
//        left = null;
//        right = null;
//    }
//}
//public class sizeoftree {
//
//    public static int getSize(Node node){
//        if(node==null){
//            return 0;
//        }
//        int left=getSize(node.left);
//        int right=getSize(node.right);
//        return left+right+1;
//
//    }
//
//    public static void main(String[] args) {
//
//        // Constructed binary tree is
//        //         1
//        //        / \
//        //       2   3
//        //      / \
//        //     4   5
//
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        System.out.println(getSize(root));
//    }
//}
