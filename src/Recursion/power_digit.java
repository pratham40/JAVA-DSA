package Recursion;

import java.util.Scanner;

public class power_digit {
    static int powerDigit(int p,int q){
        if (q==0){
            return 1;
        }
        return powerDigit(p,q-1)*p;
    }

    static int pow(int p,int q){
        if (q==0){
            return 1;
        }
        int smallPow=pow(p,q/2);
        if (q%2==0){
            return smallPow*smallPow;
        }
        return p*smallPow*smallPow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        int q= sc.nextInt();
        System.out.println(powerDigit(p,q));
        System.out.println(pow(p,q));
    }
}
