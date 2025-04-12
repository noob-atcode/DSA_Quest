package BinaryTree;

public class Foldade {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public boolean Isfoldade(Node node){
        if(node==null){
           return true;
        }
        return node.left==node.right && Isfoldade(node.left)&&Isfoldade(node.right);
    }
}
