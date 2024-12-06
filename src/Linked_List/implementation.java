package Linked_List;

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertAtHead(int data){
            Node temp =new Node(data);
            if (head==null){
                head=temp;
                tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
        }

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
        int size(){
            int count=0;
            Node temp = head;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAt(int index,int data){
            Node temp1=new Node(data);
            Node temp=head;
            if (index>size()){
                return;
            } else if (index==0) {
                insertAtHead(data);
                return;
            }
            else if (index==size()){
                insertAtEnd(data);
                return;
            }
            for (int i = 0; i <index-1 ; i++) {
                temp=temp.next;
            }
            temp1.next=temp.next;
            temp.next=temp1;
        }

        int get(int index){
            Node temp =head;
            for (int i = 0; i <index ; i++) {
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int index){
            if (index==0){
                head=head.next;
                return;
            }
            Node temp=head;

            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if (index-1==size()-1) {
                tail = temp;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist l =new linkedlist();
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(43);
        l.insertAtEnd(33);
//        l.display();
//        System.out.println(l.size());
//        System.out.println("head");
//        l.insertAtHead(12);
//        System.out.println("nnn");
//        System.out.println(l.size());

//        l.insertAt(0,23);
//        l.display();

//        l.insertAt(0,120);
//        l.display();
//        System.out.println(l.get(9));
        l.deleteAtIndex(4);
        System.out.println(l.tail.data);
        l.display();
    }
}
