package Geek_For_Geek;

import java.util.ArrayList;
import java.util.HashMap;

public class IndexesOfSubarraySum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        ans.add(-1);
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            int rem=sum-s;
            if (map.containsKey(rem)){
                ans.set(0,map.get(rem)+2);
                ans.add(i+1);
                return ans;
            }
            map.put(sum,i);
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr = {5,3,4};
        int n = arr.length;
        int s = 2;
        ArrayList<Integer> ls = subarraySum(arr,n,s);
        System.out.println(ls);
    }
}
