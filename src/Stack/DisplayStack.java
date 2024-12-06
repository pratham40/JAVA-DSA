package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        By Recursion
        display(st);
//        Stack<Integer> temp = new Stack<>();
//        while (!st.isEmpty()){
//            temp.push(st.pop());
//        }
//        while (!temp.isEmpty()){
//            int x=temp.pop();
//            System.out.println(x);
//            st.push(x);
//        }
    }

    private static void display(Stack<Integer> st) {
        if (st.isEmpty()){
            return;
        }
        int x=st.pop();
        System.out.println(x);
        display(st);
        st.push(x);
    }
}
