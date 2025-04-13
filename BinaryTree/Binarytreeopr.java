package BinaryTree;

import java.util.Scanner;

public class Binarytreeopr {
    private static class Node{
        int value;
      Node left;
      Node right;
      int depth;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;

    public void insert(int value){
        System.out.println("Enter the root node");
        root=insert(value,root);
    }
    private Node insert(int value,Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.depth = (Math.max(depth(node.left),depth(node.right)))+1;

        return node;
    }
    //leaf node sum
    public int Count(Node node,int count){
        if(node==null){
            return 0;
        }
       if(node.left==null && node.right==null){
           count=count+1;
       }
     count= Count(node.left,count);
        count=  Count(node.right,count);
       //int is call by value when we
        // that's why we have to keep update the count at each call because in recurse call stack not know count value of we not
        //updated it


        return count;
    }
    //count the sum of leaves
    public int Sumofleaves( Node node ,int sum){
     if(node==null){
         return 0;
     }
     if(node.left==null && node.right==null){
         sum=sum+node.value;
     }

     sum=Sumofleaves(node.left,sum);
     sum=Sumofleaves(node.right,sum);

     return sum;
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

    }

    //Height of tree;
    public int depth(Node node){
        if(node==null){
            return -1;
        }
        return  node.depth;
    }
}
