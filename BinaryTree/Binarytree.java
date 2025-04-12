package BinaryTree;


import java.util.Scanner;
import java.util.Stack;

public class Binarytree {

    public Binarytree(){

    }
    //Initialize class Node
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node:");
        int value= scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of"+node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node"+node.value);
            int value= scanner.nextInt();
           node.left=new Node(value);
           populate(scanner,node.left);
        }
        //For the right
        System.out.println("Do you want to enter right of "+node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right node"+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);

        }
    }
    public void display(){
        display(this.root,"");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

    }
  //Preorder
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }
  //In-order
    public void Inorder(){
        Inorder(root);
    }
    private void Inorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        System.out.println(node.value);
        preorder(node.right);

    }

    //Postorder
    public void Postorder(){
        Postorder(root);
    }
    private void Postorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value);
    }
    //Preoder by using stack
    public void stackpreorder() {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.value + " ");

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
    //inoder  using stack
    public void inorder() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }
    }

    //post order using stack
    public void stackpostorder() {
        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) {
                stack1.push(current.left);
            }
            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " ");
        }
    }




    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Binarytree tree=new Binarytree();
       tree.populate(scanner);
       tree.display();
    }

}
