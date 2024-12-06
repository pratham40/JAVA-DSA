package BinaryTree;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    private static void pip(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("pre " + n);
        pip(n - 1);
        System.out.println("in " + n);
        pip(n - 1);
        System.out.println("post " + n);
    }
}
