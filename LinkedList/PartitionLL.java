package DSA_Quest.LinkedList;
//https://www.geeksforgeeks.org/partitioning-a-linked-list-around-a-given-value-and-keeping-the-original-order/
public class PartitionLL {
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
    static  Node Linked_partList(Node node,int x){
        Node current=node;
        //dummy nodes
        Node dumhead_1=new Node(0);
        Node dumhead_2=new Node(0);
        Node dumhead_3=new Node(0);

        Node dum_1=dumhead_1;
        Node dum_2=dumhead_2;
        Node dum_3=dumhead_3;

        while (current!=null){
            //for less value;
            if(current.value<x){
                dum_1.next=current;
                dum_1=dum_1.next;
            }else if(current.value==x){
                dum_2.next=current;
                dum_2=dum_2.next;
            }
            if(current.value>x){
                dum_3.next=current;
                dum_3=dum_3.next;
            }

            current=current.next;
        }
        dum_3.next=null;

        dum_1.next=dumhead_2.next;
        dum_2.next=dumhead_3.next;
        Node newHead=dumhead_1.next;

    return newHead;
    }

    static void display(Node node){
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);


        head=Linked_partList(head,2);
        display(head);
    }
}
