package GenericTrees;

import java.util.*;

public class Implementation {
    static class Node{
        int val;
        List<Node> child;

        Node(int val){
            this.val=val;
            child=new ArrayList<>();
        }
    }

    static void preorder(Node root){
        if (root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }

        System.out.print(root.val+" ");
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            preorder(root.child.get(i));
        }
    }

    static void postorder(Node root){
        if (root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            postorder(root.child.get(i));
        }
        System.out.print(root.val+" ");
    }

    static void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node currentNode = q.poll();
            System.out.print(currentNode.val+" ");
            int n = currentNode.child.size();
            for (int i = 0; i < n; i++) {
                q.add(currentNode.child.get(i));
            }
        }

    }

    static void zigZag(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while (!q.isEmpty()){
            int size=q.size();
            List<Node> currentLevel=new ArrayList<>();
            while (size-->0){
                Node currentNode=q.poll();
                currentLevel.add(currentNode);
                int n = currentNode.child.size();
                for (int i = 0; i < n; i++) {
                    q.add(currentNode.child.get(i));
                }
            }
            if(!flag){
                for (Node ele:currentLevel){
                    System.out.print(ele.val+" ");
                }
                flag=true;
            }else {
                for (int i = currentLevel.size()-1; i >=0 ; i--) {
                    System.out.print(currentLevel.get(i).val+" ");
                }
                flag=false;
            }
        }

    }


    static int findMax(Node root){
        if (root.child.isEmpty()){
            return root.val;
        }
        int maxTillNow=root.val;
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            int childMax=findMax(root.child.get(i));
            if (childMax>maxTillNow){
                maxTillNow=childMax;
            }
        }
        return maxTillNow;
    }

    static void mirrorTree(Node root){
        int n = root.child.size();
        if (root.child.isEmpty() || n==1){
            return;
        }
        for (int i = 0; i < n; i++) {
            mirrorTree(root.child.get(i));
            Collections.reverse(root.child);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        root.child.getFirst().child.add(new Node(1));
        root.child.getFirst().child.add(new Node(4));
        root.child.getFirst().child.add(new Node(8));

        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(17));
        root.child.get(1).child.add(new Node(15));

        root.child.getLast().child.add(new Node(31));
        root.child.getLast().child.add(new Node(55));
        root.child.getLast().child.add(new Node(65));
        System.out.println("PreOrder ----------->");
        preorder(root);
        System.out.println("\nPostOrder ----------->");
        postorder(root);
        System.out.println("\nBFS");
        BFS(root);
        System.out.println("\nZigZag");
        zigZag(root);
        System.out.println("\nFind Max "+findMax(root));
        System.out.println("Mirror Tree");
        mirrorTree(root);
        System.out.println("After Mirror");
        BFS(root);
    }
}
