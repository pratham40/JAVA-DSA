package Queue.implementation;

public class IntegerArrayQueue {
    static class ArrayQueue{
        int front=-1;
        int rear=-1;
        int size=0;
        public int[] arr = new int[100];

        void add(int ele){
            if (rear==arr.length-1){
                System.out.println("Queue is Full");
                return;
            }
            if (front==-1){
                front=rear=0;
                arr[rear]=ele;
            }
            else {
                arr[++rear]=ele;
            }
            size++;
        }

            int remove(){
            if (size==0){
                System.out.println("Queue is already empty");
                return Integer.MIN_VALUE;
            }
             arr[front]=0;
             front++;
             size--;
             return arr[front-1];
            }
            int peek(){
            return arr[front];
            }

    }
    public static void main(String[] args) {

    }
}
