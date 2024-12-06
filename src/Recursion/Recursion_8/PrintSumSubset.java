package Recursion.Recursion_8;

public class PrintSumSubset {
    static void printSumSubset(int[] arr,int idx,int currSum){
//        Base Case
        if (idx==arr.length){
            System.out.println(currSum);
            return;
        }
//        idx+currSum
        printSumSubset(arr,idx+1,currSum+arr[idx]);
//        currSum
        printSumSubset(arr,idx+1,currSum);
    }
    public static void main(String[] args) {
        printSumSubset(new int[]{2,4,5},0,0);
    }
}
