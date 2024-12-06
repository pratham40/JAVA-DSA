package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConstructTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static Node constructBfs(String[] arr) {
        Queue<Node> q = new LinkedList<>();
        int rootVal = Integer.parseInt(arr[0]);
        Node root = new Node(rootVal);
        q.add(root);
        int i = 1;
        int n = arr.length;
        while (i < n - 1) {
            Node temp = q.remove();
            Node left = new Node(11);
            Node right = new Node(11);
            if (arr[i].isEmpty()) {
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }
            if (arr[i + 1].isEmpty()) {
                right = null;
            } else {
                int r = Integer.parseInt(arr[i + 1]);
                right.data = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) { //leaf node
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTree(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.left != null) {
            mid++;
        }
        if (root.right != null) {
            mid++;
        }
        return Math.max(mid, Math.max(leftAns, rightAns));
    }
    public static void helper(List<List<Integer>> ans, List<Integer> arr, Node root, int targetSum){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.data);
            if(root.data==targetSum){
                List<Integer> a = new ArrayList<>();
                for(int i=0;i<arr.size();i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.removeLast();
            return;
        }
        arr.add(root.data);
        helper(ans,arr,root.left,targetSum-root.data);
        helper(ans,arr,root.right,targetSum-root.data);
        arr.removeLast(); //backtrack
    }

    public static void main(String[] args) {
//        String[] arr = {"3", "9", "20", "", "", "15", "7"};
//        Node root = constructBfs(arr);
//        String[] list = {"4", "-7", "-3", "", "", "-9", "-3", "9", "-7", "-4", "", "6", "", "-6", "-6",
//                "", "", "0", "6", "5", "", "9", "", "", "-1", "-4", "", "", "", "-2"};

//        Node root = constructBfs(list);
//        System.out.println(diameterOfBinaryTree(root));
        String[] arr = {"1", "2", "3", "4", "5", "", "6", "7", "", "8", "", "9", "10", "", "11", "",
                "12","", "13", "", "14", "15", "16", "", "17", "", "", "18", "", "19", "", "", "", "20",
                "21","22", "23", "", "24", "25", "26", "27", "", "", "28", "", ""};
        Node root = constructBfs(arr);
        String[] arr2={"5","4","8","11","","13","4","7","2","","","5","1"};
        Node root2=constructBfs(arr2);
        System.out.println(pathSum(root2,22));
        boundaryDisplay(root);
    }
    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(ans,arr,root,targetSum);
        return ans;
    }
    private static void boundaryDisplay(Node root) {
        leftBoundary(root);
        bottomBoundary(root);
        rightBoundary(root.right );
    }

    private static void rightBoundary(Node root) {
        if (root==null) return;
        if (root.left==null && root.right == null) return;
        if (root.right!=null) rightBoundary(root.right);
        else rightBoundary(root.left);
        System.out.print(root.data+" ");
    }

    private static void bottomBoundary(Node root) {
        if (root==null) return;
        if (root.left==null && root.right == null) {
            System.out.print(root.data+" ");
            return;
        }
        bottomBoundary(root.left);
        bottomBoundary(root.right);

    }

    private static void leftBoundary(Node root) {
        if (root==null) return;
        if (root.left==null && root.right == null) return;
        System.out.print(root.data+" ");
        if (root.left!=null) leftBoundary(root.left);
        else leftBoundary(root.right);
    }
}
