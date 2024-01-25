public class SinglyLinkedList {
   
    // create node for Linked List
    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        a.next = b;
        Node c = new Node(5);
        b.next = c;
        Node d = new Node(6);
        c.next = d;
        Node e = new Node(7);
        d.next = e;

        //  first method print data from linked list 

        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // System.out.println(a.next.next.next.next.next.data);

        Node temp = a;

        // static size data print  
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        // dynamic size data print 
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
