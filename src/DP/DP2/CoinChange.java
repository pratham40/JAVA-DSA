package DP.DP2;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2,5,3,6};
        int totalSum=10;
//        System.out.println(recursive(coins,totalSum, 0));

        int n = coins.length;
        int[][] dp = new int[n+1][totalSum+1];
//        for (int[] arr :dp){
//            Arrays.fill(arr,Integer.MAX_VALUE);
//        }
//        System.out.println(coins1(coins,totalSum,0,dp));

        for (int i = 0; i <= totalSum; i++) {
            if (i%coins[0]==0){
                dp[0][i]=1;
            }else {
                dp[0][i]=0;
            }
        }

        for (int idx = 1; idx < n; idx++) {
            for (int sum = 0; sum <= totalSum; sum++) {
                int pick=0;
                if (sum>=coins[idx]){
                    pick=dp[idx][sum-coins[idx]];
                }
                int not_pick=dp[idx-1][sum];

                dp[idx][sum]=pick+not_pick;
            }
        }
        System.out.println(dp[n-1][totalSum]);
    }

    private static int coins1(int[] coins, int sum, int idx, int[][] dp) {
        if (idx==coins.length-1){
            if (sum%coins[idx]==0){
                return 1;
            }else {
                return 0;
            }
        }
        if (sum==0){
            return 1;
        }
        if (dp[idx][sum]!=Integer.MAX_VALUE){
            return dp[idx][sum];
        }
        int pick=0;
        if (sum>=coins[idx])
        {
            pick = coins1(coins, sum - coins[idx], idx,dp);
        }
        int not_pick=coins1(coins,sum,idx+1,dp);
        dp[idx][sum]=pick+not_pick;
        return dp[idx][sum];
    }

    private static int recursive(int[] coins,int sum,int idx){
        if (idx==coins.length-1){
            if (sum%coins[idx]==0){
                return 1;
            }else {
                return 0;
            }
        }
        if (sum==0){
            return 1;
        }
        int pick=0;
        if (sum>=coins[idx])
        {
            pick = recursive(coins, sum - coins[idx], idx);
        }
        int not_pick=recursive(coins,sum,idx+1);
        return pick+not_pick;
    }
}
