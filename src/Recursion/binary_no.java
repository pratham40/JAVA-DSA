package Recursion;

import java.util.Scanner;

public class binary_no{

    static int binaryNo(int n){
        if (n==1){
            return 1;
        }
        return binaryNo(n/2)*10+n%2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(binaryNo(n));
    }
}
