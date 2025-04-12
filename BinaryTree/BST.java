package BinaryTree;

import java.util.Scanner;

public class BST {

    private static class  Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val){
            this.val=val;
        }

        public int getVal() {
            return val;
        }
    }

    private  Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }


    public void insert(int value){
    root =insert(value,root );
    }
    private Node insert(int value,Node node){
      if(node==null){
          node =new Node(value);
          return node;
      }
        if(value<node.val){
          node.left=  insert(value,node.left);
        }
        if(value>node.val){
            node.right=insert(value,node.right);
        }
        node.height=(Math.max(height(node.right),height(node.left)))+1;
        return node;
    }

    public void display(){
        display(this.root,"Root node:");
    }
    private  void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left,"Left child of"+node.val+":");
        display(node.right,"Right child of"+node.val+":");
    }

    public void populate(int[]num){
        for(int i=0;i<num.length;i++){
            this.insert(num[i]);
        }
    }

    public void populatedsort(int[]num){
        populatedsort(num,0,num.length-1);
    }
    private void populatedsort(int[]num,int start,int end){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(num[mid]);
        populatedsort(num,start,mid-1);
        populatedsort(num,mid+1,end);
    }
//Main class method
    public static void main(String[] args) {

        BST tree=new BST();
        int[] num={1,2,3,4,5,6,7,8,9,10};
        tree.populatedsort(num);
//        tree.populate(num);
        tree.display();
    }

}
