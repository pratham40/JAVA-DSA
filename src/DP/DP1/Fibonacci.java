package DP.DP1;

import java.util.Arrays;

public class Fibonacci {
    static int count=0;
    static int fib(int n ){
//        count++;
        if (n==0 || n ==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }

//    DP

    static int fib1(int n ,int[] dp){
        if (n==0 || n ==1){
            return 1;
        }

        count++;
        if (dp[n]!=Integer.MAX_VALUE){
            return dp[n];
        }
        int res=fib1(n-1,dp)+fib1(n-2,dp);
        dp[n]=res;
        return res;
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println("fib(5) = " + fib(n));
//        System.out.println("count = " + count);

        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        System.out.println("fib1(n,dp) = " + fib1(n,dp));
        System.out.println("count = " + count);

    }
}
