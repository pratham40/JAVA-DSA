package BST;

import java.util.LinkedList;
import java.util.Queue;

public class Deletion {
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
        int rootVal=Integer.parseInt(arr[0]);
        Node root = new Node(rootVal);
        q.add(root);
        int i=1;
        while (i<arr.length){
            Node temp=q.remove();
            Node left=new Node(-1);
            Node right = new Node(-1);
            if (!arr[i].isEmpty()){
                left.val=Integer.parseInt(arr[i]);
                q.add(left);
            }
            else {
                left=null;
            }
            if (!arr[i+1].isEmpty()){
                right.val=Integer.parseInt(arr[i+1]);
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

    static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void deletion(Node root,int target){
        if (root==null) return;
        if (root.val>target){
            if (root.left.val==target){
                Node temp=root.left;
                if (temp.left==null && temp.right==null){
                    root.left=null;
                }
                else if (temp.left==null || temp.right==null){
                    if (temp.left==null){
                        root.left=temp.right;
                    }
                    else{
                        root.left=temp.left;
                    }
                }
            }else {
                deletion(root.left,target);
            }
        }
        else{
            if (root.right.val==target){
                Node temp=root.right;
                if (temp.left==null && temp.right==null){
                    root.right=null;
                }
                else if (temp.left==null || temp.right==null){
                    if (temp.left==null){
                        root.right=temp.right;
                    }
                    else{
                        root.right=temp.left;
                    }
                }
            }else {
                deletion(root.right,target);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node root = constructBFS(arr);
        preOrder(root);
        System.out.println();
        deletion(root,28);
        deletion(root,14);
        deletion(root,34);
        deletion(root,89);
        preOrder(root);
    }
}
