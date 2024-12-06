package Stack.LinkedListStack;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList stack = new IntegerLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.display();
        stack.pop();
//        stack.display();
//        System.out.println(stack.peek());
        System.out.println(stack.top);
    }
}
