package Stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str="(()(())(";
        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch=='('){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.peek()=='('){
                    stack.pop();
                }
            }
        }
//        System.out.println(stack.size());
        return stack.isEmpty();
    }
}

