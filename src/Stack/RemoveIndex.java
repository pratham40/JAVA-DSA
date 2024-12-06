package Stack;

import java.util.Stack;

public class RemoveIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);     // 1
        st.push(2);     // 2
        st.push(3);     // 3
        st.push(4);     // 4
        st.push(5);     // 5
        Stack<Integer> temp = new Stack<>();
        while(st.size()>3){
            temp.push(st.pop());
        }
        st.pop();
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println("stack = " + st);
    }
}
