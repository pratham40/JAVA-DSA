package Recursion;

import java.util.Scanner;

public class multiple {

    static void series1(int n,int k){
        if (k==1){
            System.out.print(n*k+" ");
            return;
        }
        series1(n,k-1);
        System.out.print(n*k+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        series1(n, k);
    }
}
