package Recursion;

import java.util.Scanner;

public class prime_number {

    static boolean isPrime(int n,int i){
        if (n<=2) return false;
        if (n%i==0) return false;
        if (i*i>n) return true;
        return isPrime(n,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n,2));
    }
}
