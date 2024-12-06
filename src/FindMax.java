import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] wt = {1,2,3,2,2};
        int[] val={8,4,0,5,3};
        int cap=4;
        int ans = find(0,cap,wt,val);
        System.out.println("ans = " + ans);
        int[][] dp = new int[cap+1][wt.length+1];
        for (int[] i:dp){
            Arrays.fill(i,-1);
        }
        int ans2=find2(0,cap,wt,val, dp);
        System.out.println("ans2 = " + ans2);
    }

    private static int find2(int i, int cap, int[] wt, int[] val,int[][] dp) {
        if (i> wt.length-1){
            return 0;
        }
        if (dp[cap][i]!=-1){
            return dp[cap][i];
        }
        int inc=0;
        if (cap>=wt[i]){
            inc+=val[i]+find2(i+1,cap-wt[i],wt,val,dp);
        }
        int exc=find2(i+1,cap,wt,val,dp);
        dp[cap][i]=Math.max(inc,exc);
        return Math.max(inc,exc);
    }

    static int find(int i, int cap, int[] wt, int[] val) {
        if (i> wt.length-1){
            return 0;
        }
        int inc=0;
        if (cap>=wt[i]){
            inc+=val[i]+find(i+1,cap-wt[i],wt,val);
        }
        int exc=find(i+1,cap,wt,val);
        return Math.max(inc,exc);
    }
}
