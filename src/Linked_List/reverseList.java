package Linked_List;

public class reverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }

     Node reverse(Node head){
         if(head==null ||  head.next==null){
             return head;
         }
         Node newHead=reverse(head.next);
         head.next.next=head;
         head.next=null;
         return newHead;
     }

    static Node reverseRecursive(Node head){
        if (head.next==null){
            return head;
        }
        Node newHead= reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    static void  display(Node head){
        if (head==null) return;
        display(head.next);
        System.out.println(head.val+" ");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        display(a);
//      Reverse Linked List
//        reverse(a);

        reverseRecursive(a);
        display(a);

    }
}
