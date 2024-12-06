package Queue;

import Queue.implementation.IntegerListQueue;

public class Main {
    public static void main(String[] args) {
        IntegerListQueue listQueue = new IntegerListQueue();
        listQueue.offer(12);
        listQueue.offer(23);
        listQueue.offer(34);
        listQueue.display();
        System.out.println(listQueue.isEmpty()+" "+listQueue.peek());
    }
}
