package Stack.ArrayStack;

import Stack.adt.Stack;

public class IntegerArrayStack  implements Stack {
    private final int[] array = new int[5];
    private  int top=-1;

    int size;

    @Override
    public void push(int data) {
        if (top==array.length-1){
            System.err.println("OverFlow");
            return;
        }
        top++;
        array[top]=data;
        size++;
    }

    @Override
    public int pop() {
        if (isUnderflow()){
            System.err.println("UnderFlow");
            return Integer.MIN_VALUE;
        }
        int popValue=array[top];
        array[top]=0;
        top--;
        size--;
        return popValue;
    }

    @Override
    public int peek() {
        if (isUnderflow()){
            System.err.println("UnderFlow");
            return Integer.MIN_VALUE;
        }
        return array[top];
    }

    @Override
    public void display() {
        int i=top;
        while (i>=0){
            if (array[i]>0){
                System.out.println(array[i]);
            }
            i--;
        }
    }

    @Override
    public boolean isUnderflow() {
        return top==-1;
    }

    @Override
    public int getSize() {
        return size;
    }
}
