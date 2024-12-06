package Stack.LinkedListStack;

import Stack.adt.Stack;
import Stack.node.node;

public class IntegerLinkedList implements Stack {
    node top=null;
    int size;
    @Override
    public void push(int data) {
        node temp = new node(data);
        temp.next=this.top;
        this.top=temp;
        size++;
    }
    @Override
    public int pop() {
        if (isUnderflow()){
            System.err.println("UnderFlow");
            return Integer.MIN_VALUE;
        }
        int popData=this.top.data;
        this.top=this.top.next;
        size--;
        return popData;
    }

    @Override
    public int peek() {
        return top.data;
    }

    @Override
    public void display() {
        node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    @Override
    public boolean isUnderflow() {
        return top==null;
    }

    @Override
    public int getSize() {
        return size;
    }
}
