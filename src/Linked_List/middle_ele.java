package Linked_List;

public class middle_ele {
    public static class Node{
        int data;
        Node Next;
        Node(int data){
            this.data=data;
        }

        int size(Node head){
            int count=0;
            Node temp=head;
            while (temp!=null){
                count++;
                temp=temp.Next;
            }
            return count;
        }

        Node middle_element(Node head){
            Node slow=head;
            Node fast=head;
            if (size(head)%2==0){
                while (fast.Next.Next!=null){
                    slow=slow.Next;
                    fast=fast.Next.Next;
                }
            }
            else {
                while (fast.Next!=null){
                    slow=slow.Next;
                    fast=fast.Next.Next;
                }
            }
            return slow;
        }

        Node middle_ele_2(Node head){
            Node slow=head;
            Node fast=head;
            while (fast.Next!=null && fast.Next.Next!=null){
                slow=slow.Next;
                fast=fast.Next.Next;
            }
            return slow;
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
        System.out.println(a.middle_element(a).data);
        System.out.println(a.middle_ele_2(a).data);

    }
}
