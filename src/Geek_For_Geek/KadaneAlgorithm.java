package Geek_For_Geek;

public class KadaneAlgorithm {
    static long maxSubarraySum(int[] arr) {

        // Your code here
        long maxSum=arr[0];
        long currSum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        System.out.println(maxSubarraySum(arr));
    }
}
