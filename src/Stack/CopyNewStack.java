package Stack;

import java.util.Stack;

public class CopyNewStack {
    public static void main(String[] args) {
//        Copy contents of one stack to another in same order
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        while (!temp.isEmpty()){
            newStack.push(temp.pop());
        }
        System.out.println("newStack = " + newStack);
    }
}
