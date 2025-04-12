package BinaryTree;
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
public class Maximumoftree {

    public static int maxnum(Node node){
            if(node.left==null && node.right==null){
                return node.data;
            }
            int left=maxnum(node.left);
            int right=maxnum(node.right);

            return Math.max(left,right);
    }
    public static void main(String[] args) {

        // Constructed binary tree is
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(maxnum(root));
}
}

