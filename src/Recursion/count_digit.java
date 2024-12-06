package Recursion;

import java.util.Scanner;

public class count_digit {

    static int sumDigits(int n){
        if (n<10){
            return 1;
        }
        return sumDigits(n/10)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sumDigits(n));
    }
}
