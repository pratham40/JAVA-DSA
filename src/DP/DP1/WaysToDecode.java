package DP.DP1;

import java.util.Arrays;

public class WaysToDecode {
    public static void main(String[] args) {
        String str="1106";
        int n = str.length();
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        System.out.println(numDecodings(str,str.length()-1));

        System.out.println(numDecodings2(str,str.length()-1,dp));
    }

    private static int numDecodings2(String str, int idx, int[] dp) {
        if (idx<=0){
            return 1;
        }

        if (dp[idx]!=Integer.MAX_VALUE){
            return dp[idx];
        }
        int not_combine=0;
        if (str.charAt(idx)!='0'){
            not_combine=numDecodings2(str,idx-1,dp);
        }
        int combine=0;
        if (str.charAt(idx-1)<='2' && str.charAt(idx)<='6'){
            combine=numDecodings2(str,idx-2,dp);
        }
        dp[idx]=combine+not_combine;
        return dp[idx];
    }

    private static int numDecodings(String str, int idx) {
        if (idx<=0){
            return 1;
        }
        int not_combine=0;
        if (str.charAt(idx)!='0'){
            not_combine=numDecodings(str,idx-1);
        }
        int combine=0;
        if (str.charAt(idx-1)<='2' && str.charAt(idx)<='6'){
            combine=numDecodings(str,idx-2);
        }
        return combine+not_combine;
    }
}
