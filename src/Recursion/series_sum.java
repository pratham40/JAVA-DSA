package Recursion;

import java.util.Scanner;

public class series_sum {

//    Multiple

//    I/P = n=10
//    O/P = -5
//    1-2+3-4+5-6+7-8+9-10

    static int series2(int n){
        if (n==1){
            return 1;
        }
        int sum=series2(n-1);
        if (n%2==0){
            return sum-n;
        }
        return sum+n;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(series2(n));
    }
}
