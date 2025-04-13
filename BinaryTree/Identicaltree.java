package BinaryTree;

public class Identicaltree {
   public static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    public boolean isidentical(Node node1,Node node2){
      //if both root is empty
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        //3 check points
        return (node1.data==node2.data) && isidentical(node1.left,node2.left) && isidentical(node1.right,node2.right);
    }

    public static void main(String[] args) {
        Identicaltree x=new Identicaltree();
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);
        r1.left.left = new Node(4);

        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);
        r2.left.left = new Node(5);

        if(x.isidentical(r1,r2)){
            System.out.println("Yeep");
        }else{
            System.out.println("Nope");
        }
    }
}
