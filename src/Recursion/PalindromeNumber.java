package Recursion;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindromeNo(n,0));
    }

    private static boolean isPalindromeNo(int a, int b) {
        if (a==b){
            return true;
        }
        if (a<b){
            if (a!=b/10) return false;
        }
        return isPalindromeNo(a/10,b*10+a%10);
    }
}
