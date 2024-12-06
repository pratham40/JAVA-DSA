package Geek_For_Geek;

public class MaximumScoreFromSubarrayMinimums {
    public static int pairWithMaxSum(int[] arr) {
        // Your code goes here
        int maxSum=-1;
        for (int i = 0; i < arr.length-1; i++) {
            int min=arr[i];
            int secMin=arr[i+1];
            for (int j = i+1; j < arr.length; j++) {
                if (min>arr[j]){
                    secMin=min;
                    min=arr[j];
                } else if (secMin>arr[j]) {
                    secMin=arr[j];
                }
                int currSum=min+secMin;
                maxSum=Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        System.out.println(pairWithMaxSum(arr));
    }
}
