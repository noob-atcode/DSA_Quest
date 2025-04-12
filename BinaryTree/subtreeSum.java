package BinaryTree;

public class subtreeSum {
    public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public int Subtreesum(Node node,boolean[]foundsum,int target){
        //if root is empty
        if(node==null){
            return  0;
        }
        int currentsum=Subtreesum(node.left,foundsum,target)+Subtreesum(node.right,foundsum,target)+node.data;

        if(currentsum==target){
            foundsum[0]=true;
        }
        return currentsum;

    }
    public boolean hasSubtreesum(Node node,int sum){
        boolean[] foundsum=new boolean[1];
        Subtreesum(node,foundsum,sum);
        return foundsum[0];
    }

    public static void main(String[] args) {
        subtreeSum tt=new subtreeSum();
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
        System.out.println(tt.hasSubtreesum(root,10));
        System.out.println(tt.Subtreesum(root,new boolean[1],15));//it gives all the sumation ony job is to find where the subtree sum found
    }
}
