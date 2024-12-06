package Stack.node;

public class node {
    public int data;
    public node next;

    public node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
