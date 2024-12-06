package Recursion;

import java.util.Scanner;

public class Armstrong_Number {

    static int isArmstrong(int n,int count){
        if (n==0){
            return 0;
        }
        return pow(n%10,count)+isArmstrong(n/10,count);
    }

    static int pow(int a,int b){
        if (b==0) return 1;
        if (b%2==0) return pow(a,b/2)*pow(a,b/2);
        return a*pow(a,b/2)*pow(a,b/2);
    }

    static int count_digit(int n){
        if (n==0) return 0;
        return 1+count_digit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int count=count_digit(x);
        if (x==isArmstrong(x,count)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
