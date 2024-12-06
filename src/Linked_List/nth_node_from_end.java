package Linked_List;

public class nth_node_from_end {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail =null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head==null){
                head=temp;
            }
            else {
                tail.next=temp;
            }
            tail=temp;
        }

        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int  size(){
            int count=0;
            Node temp=head;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        Node nth_node_end(int index){
            Node temp=head;
            for (int i = 0; i <size()-index ; i++) {
                temp=temp.next;
            }
            return temp;
        }

        Node nth_node_end_2(int index){
            Node slow=head;
            Node fast=head;
            for (int i = 0; i <index ; i++) {
                fast=fast.next;
            }
            while (fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        void delete_nth_node_end_2(int index){
            Node slow=head;
            Node fast=head;
            for (int i = 0; i <index ; i++) {
                fast=fast.next;
            }
            if (fast==null){
                head=head.next;
                return;
            }
            while (fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(100);
        l.insertAtEnd(13);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtEnd(12);
        l.insertAtEnd(10);
//        l.display();
//        System.out.println();
//        System.out.println(l.size());
//        System.out.println(l.nth_node_end(1).data);
//        System.out.println(l.nth_node_end(2).data);
//        System.out.println(l.nth_node_end(3).data);
//        System.out.println(l.nth_node_end(4).data);
//        System.out.println(l.nth_node_end(5).data);
//        System.out.println(l.nth_node_end(6).data);


//        Slow-Fast Approach
//          In 1 Transversal

//        System.out.println(l.nth_node_end_2(1).data);
        l.delete_nth_node_end_2(6);
        l.display();
    }
}
