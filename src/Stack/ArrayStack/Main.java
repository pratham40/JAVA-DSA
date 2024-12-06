package Stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        IntegerArrayStack stack = new IntegerArrayStack();
        stack.push(2);
        stack.push(4);
        stack.push(4);
//        stack.display();
//        System.out.println(stack.size);
        stack.push(2);
        stack.push(4);
        stack.display();
        stack.push(4);
    }
}
