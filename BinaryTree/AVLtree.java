package BinaryTree;

public class AVLtree {
    private static class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.val) {
            node.left = insert(value, node.left);
        }
        if (value > node.val) {
            node.right = insert(value, node.right);
        }
        node.height = (Math.max(height(node.right), height(node.left))) + 1;
        return rotate(node);
    }
    public Node rotate(Node node){
        //left heavy
        if(height(node.left)-height(node.right)>1){
           // left-left case
             if(height(node.left.left)-height(node.left.right)>0){
               return   rightrotate(node);
             }
             //left-right case
            if(height(node.left.left)-height(node.left.right)<0){
                node.left=leftrotate(node.left);
                return rightrotate(node);
            }
            //right heavy

        }
        if(height(node.left)-height(node.right)<-1){
            //right-right case
            if(height(node.right.left)-height(node.right.right)<0){
                return leftrotate(node);
            }
            //right-left case
            if(height(node.right.left)-height(node.right.right)>0){
                node.right=rightrotate(node.right);
                return leftrotate(node);
            }
        }
        return node;
    }

     public Node rightrotate(Node p){
        Node c=p.left;
        Node t=c.right;
        //after rotation
         c.right=p;
         p.left=t;

         c.height=Math.max(height(c.left),height(c.right))+1;
         p.height=Math.max(height(p.left),height(p.right))+1;
         return c;
     }

     public Node leftrotate(Node c){
        Node p=c.right;
        Node t=p.left;
        //after rotation
         p.left=c;
         c.right=t;
         c.height=Math.max(height(c.left),height(c.right))+1;
         p.height=Math.max(height(p.left),height(p.right))+1;
         return p;

     }

    public int height(){
        return height(root);
    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void display() {
        display(this.root, "Root node:");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of" + node.val + ":");
        display(node.right, "Right child of" + node.val + ":");
    }

    public void populate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            this.insert(num[i]);
        }
    }

    public void populatedsort(int[] num) {
        populatedsort(num, 0, num.length - 1);
    }

    private void populatedsort(int[] num, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(num[mid]);
        populatedsort(num, start, mid - 1);
        populatedsort(num, mid + 1, end);
    }

    public static void main(String[] args) {
        AVLtree tree=new AVLtree();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }

        System.out.println( tree.height());
        System.out.println(tree.balanced());
    }
}
