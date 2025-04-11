
//https://www.geeksforgeeks.org/design-custom-browser-history-based-on-given-operations/
public class Browser {
     Node head;
     Node current;
    private class Node{
     String data;
     Node next;
     Node prev;

        public Node(String data) {
            this.data = data;
        }

        public Node(String data, Node next,Node prev) {
            this.data = data;
            this.next = next;
            this.prev=prev;
        }
    }

    public void visit(String url){
        Node Newnode=new Node(url);
        if(head==null){
            head=Newnode;
            current=Newnode;
        }else{
            current.next=Newnode;
            Newnode.prev=current;
            current=Newnode;
        }
        System.out.println("Visited Url:"+url);
    }
    public String forth(int val){
       while(val>0 && current.next!=null){
           current=current.next;
           val--;
       }
       return current.data;

    }
    public String back(int val){
       while(val>0 && current.prev!=null){
           current=current.prev;
           val--;
       }
       return current.data;
    }

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");
        System.out.println("Back 1: " + browser.back(1)); // facebook.com
        System.out.println("Back 1: " + browser.back(1)); // google.com
//        System.out.println("Forth 1: " + browser.forth(1)); // facebook.com
        browser.visit("linkedin.com");
        System.out.println("Forth 1: " + browser.forth(1));
        System.out.println("Forth 1: " + browser.forth(1));

    }

}
