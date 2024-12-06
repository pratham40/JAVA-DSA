package Recursion;

import java.util.Scanner;

public class sum_digits {

    static int sumDigits(int n){
        if (n<10){
            return n;
        }
        return n%10+sumDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sumDigits(n));
    }
}
