package Geek_For_Geek;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLength=0;
        int sum=0;
        for (int i = 0; i < N; i++) {
            sum+=A[i];
            int rem=sum-K;
            if (map.containsKey(rem)){
                maxLength=Math.max(maxLength,i-map.get(rem));
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3};
        int k = 6;
        System.out.println(lenOfLongSubarr(arr,arr.length,k));
    }
}
