package BST;

import java.util.LinkedList;
import java.util.Queue;

public class PredSuc {
    static Queue<Node> queue = new LinkedList<>();
    static Node temp=null;
    static int pred=-1;
    static int succ=-1;
    static boolean flag=false;
    static class Node{
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node constructBFS(String[] arr){
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while (i< arr.length){
            Node temp=q.remove();
            Node left=new Node(Integer.MAX_VALUE);
            Node right=new Node(Integer.MAX_VALUE);
            if (!arr[i].isEmpty()){
                int leftVal=Integer.parseInt(arr[i]);
                left.val=leftVal;
                q.add(left);
            }
            else {
                left=null;
            }
            if (!arr[i+1].isEmpty()){
                int rightVal=Integer.parseInt(arr[i+1]);
                right.val=rightVal;
                q.add(right);
            }
            else {
                right=null;
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }

    static void inOrder(Node root,int val){
        if (root==null){
            return;
        }
        inOrder(root.left,val);
        if (temp==null) {
            temp=root;
        }
        else {
            if (root.val==val){
                pred=temp.val;
                flag=true;
            } else if (root.val>val && flag) {
                succ=root.val;
                flag=false;
            } else {
                temp=root;
            }
        }
        inOrder(root.right,val);
    }
    public static void addToQueue(Node root){
        if(root == null){
            return;
        }
        queue.add(root);
        addToQueue(root.left);
        addToQueue(root.right);
    }
    public static void flatten(Node root) {
        addToQueue(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            temp.right = queue.peek();
            temp.left = null;
        }
    }

    public static void main(String[] args) {
        String[] a = {"1","2","5","3","4","","6"};
        Node root = constructBFS(a);
        flatten(root);
//        inOrder(root,30);
//        System.out.println(pred);
//        System.out.println(succ);
    }
}
