package Stack.adt;

public interface Stack {
    void push(int data);
    int pop();
    int peek();
    void display();
    boolean isUnderflow();
    int getSize();
}
