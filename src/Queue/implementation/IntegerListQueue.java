package Queue.implementation;


import Queue.adt.Queue;
import Queue.node.QueueNode;

import java.util.ArrayList;

public class IntegerListQueue implements Queue {
    QueueNode front;
    QueueNode rear;
    public int size;

    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public void offer(int data) {
        QueueNode node = new QueueNode(data);
        if (isEmpty()){
            front=rear=node;
        }
        else {
            rear.next=node;
            rear=node;
        }
        size++;
    }

    @Override
    public int remove() {
        if (isEmpty()){
            System.err.println("Empty Queue!!!");
            return Integer.MIN_VALUE;
        }
        int removed=front.data;
        front=front.next;
        return removed;
    }

    @Override
    public int peek() {
        if (isEmpty()){
            System.err.println("Queue Empty!!!");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }
    public void display(){
        QueueNode temp=front;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
