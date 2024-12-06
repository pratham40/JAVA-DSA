package Linked_List;

public class ImplementationDoubly {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public static class DoublyLinkedList{
        public Node head=null;
        public static Node tail = null;

        void insertAtHead(int data){
            Node temp = new Node(data);
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        void insertAtTail(int data){
            Node temp = new Node(data);
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        void insertAtIndex(int idx,int data){
            Node tempNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp=temp.next;
            }
            temp.next.prev=tempNode;
            tempNode.prev=temp;
            tempNode.next=temp.next;
            temp.next=tempNode;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        static void displayReverse() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtHead(12);
        list.insertAtHead(13);
//        list.display();
    }

}
