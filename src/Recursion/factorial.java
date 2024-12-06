package Recursion;

public class factorial {

    static int factorial_no(int n){
        if (n==1 || n==0){
            return 1;
        }
        int prod=n*factorial_no(n-1);
        return prod;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial_no(n));
    }
}
