package Linked_List;


public class basics {

    public static void insertAtEnd(Node head,int data){
        Node t=new Node(data);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
    }
    public static int length(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }


//  through recursion
    static void display(Node head) {
        if (head==null){
            return;
        }
        System.out.println(head.data);
        display(head.next);
    }


    public static void print(Node head){
        Node temp=head;   //  a
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b = new Node(3);
        Node c= new Node(5);
        System.out.println(a);   // Linked_List.basics$Node@4554617c
//        a -> b
        a.next=b;  // linking

        System.out.println(a.next);    // Linked_List.basics$Node@74a14482

        System.out.println(b);      // Linked_List.basics$Node@74a14482
//          a -> b -> c
        b.next=c;       // linking

        System.out.println(b.next);     // Linked_List.basics$Node@1540e19d

        System.out.println(c);      //   Linked_List.basics$Node@1540e19d

        System.out.println(c.next);    // null
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);    .NullPointerException


//        Node temp=a;
//        System.out.println(temp);
//        System.out.println(temp.data);
//        System.out.println(temp.next);

        // Displaying Linked List

//        for (int i = 0; i <=2; i++) {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }


        print(a);


//        Recursion

        display(a);


        int len= length(a);
        System.out.println(len);

        insertAtEnd(a,12);
        display(a);
    }
}
