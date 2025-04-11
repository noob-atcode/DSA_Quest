//https://www.geeksforgeeks.org/intersection-of-two-sorted-linked-lists/
import java.util.LinkedList;
public class IntersectionLL {
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
static void FindIntersection(Node head1,Node head2){
 Node temp1=head1;

  while(temp1 !=null){
      Node temp2=head2;
      while (temp2!=null){
          if(temp1.value==temp2.value){
              System.out.print(temp1.value+"->");
          }
          temp2=temp2.next;
      }
      temp1=temp1.next;
  }
    System.out.print("End");

//    static void findIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//        System.out.print("Intersection: ");
//        for (int val : list1) {
//            if (list2.contains(val)) {
//                System.out.print(val + " -> ");
//            }
//        }
//        System.out.println("End");
//    }

}

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);

        // Create the second linked list
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        FindIntersection(head1,head2);
    }
}
