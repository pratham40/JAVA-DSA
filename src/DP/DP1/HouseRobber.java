package DP.DP1;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] house = {9,1,3,8};
        System.out.println(rob1(house,0));
        int[] dp = new int[house.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        System.out.println(rob2(house,0,dp));
    }

    private static int rob2(int[] house, int idx, int[] dp) {
        if (idx==house.length-1){
            return house[idx];
        }
        if (idx>house.length-1){
            return 0;
        }
        if (dp[idx]!=Integer.MAX_VALUE){
            return dp[idx];
        }
        int pick=house[idx]+rob2(house,idx+2,dp);
        int no_pick = rob2(house,idx+1,dp);
        dp[idx]=Math.max(pick,no_pick);
        return dp[idx];
    }

    private static int rob1(int[] house, int idx) {
        if (idx==house.length-1){
            return house[idx];
        }
        if (idx>house.length-1){
            return 0;
        }
        int pick = house[idx]+rob1(house,idx+2);
        int not_pick=rob1(house,idx+1);
        int ans = Math.max(pick,not_pick);
        return ans;
    }
}
