package Linked_List;

public class delete_middle_ele {
    public static class Node {
        int data;
        Node Next;

        Node(int data) {
            this.data = data;
        }

        void display(Node head){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.Next;
            }
        }

        void delete_middle(Node head){
            Node slow=head;
            Node fast=head;
            while (fast.Next.Next!=null && fast.Next.Next.Next!=null){
                slow=slow.Next;
                fast=fast.Next.Next;
            }
            slow.Next=slow.Next.Next;
        }

    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.Next=b;
        b.Next=c;
        c.Next=d;
        d.Next=e;
        e.Next=f;
        a.delete_middle(a);
        a.display(a);
    }
}
