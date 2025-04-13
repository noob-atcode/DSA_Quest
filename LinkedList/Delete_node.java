package DSA_Quest.LinkedList;

public class Delete_node {
    static class Node{
        int value;
       Node next;

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    static Node Delete(Node node,int x){
        //for first deletion
        if(node.value==x){
            node=node.next;
            return node;
        }
        Node get_prevnode=getIndex(node,x);
        if(node==null){
            return null;
        }
        get_prevnode.next=get_prevnode.next.next;

        return node;
    }
    static Node getIndex(Node head,int x){
        Node temp=head;
        while(temp.next.value!=x){
            temp=temp.next;
        }
        return temp;
    }
    static void display(Node node){
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        // Creating a linked list: 4 -> 5 -> 6 -> 7 -> 8
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
       head= Delete(head,8);
        display(head);
    }
}
