package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    static void printNthLevel(Node root,int n){
        if (root==null) {
            return;
        }
        if (n==1) {
            System.out.print(root.val+" ");
            return;
        }
        printNthLevel(root.left,n-1);
        printNthLevel(root.right,n-1);
    }   
    static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        if (root.left != null) System.out.print(root.left.val + "  ");
        if (root.right != null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    static int height(Node root){
        if (root==null||root.left==null && root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    static int max(Node root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }

    static int min(Node root){
        if (root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    static int productOfNodes(Node root){
        if (root==null){
            return 1;
        }
        return root.val*(productOfNodes(root.left)*productOfNodes(root.right));
    }
    static int size(Node root){
        if (root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
    static int sumOfNode(Node root){
        if (root==null){
            return 0;
        }
        return root.val+sumOfNode(root.left)+sumOfNode(root.right);
    }
    static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }
    static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node temp = q.peek();
            if (temp.left!=null){
                q.add(temp.left);
            }
            if (temp.right!=null){
                q.add(temp.right);
            }
            System.out.print(q.remove().val+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        display(root);
        preOrder(root);
        System.out.println(size(root));
        System.out.printf("sum = %d\n",sumOfNode(root));
        System.out.printf("Max = %d\n",max(root));
        System.out.printf("height = %d\n",height(root));
        System.out.printf("Min = %d\n",min(root));
        System.out.printf("product = %d\n",productOfNodes(root));

        int level=height(root)+1;
        for (int i = 1; i <= level; i++) {
            printNthLevel(root,i);
            System.out.println();
        }
        bfs(root);
    }

}
