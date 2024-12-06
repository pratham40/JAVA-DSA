package Stack;

import java.util.Stack;

public class InsertionStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        Stack<Integer> temp = new Stack<>();
        while (st.size()>2){
            temp.push(st.pop());   // 5 4
        }
        st.push(3);
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println("st = " + st);
    }
}
