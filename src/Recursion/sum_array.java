package Recursion;

public class sum_array {

    static int sumArray(int[] arr,int i){
        if (i==arr.length){
            return 0;
        }
        int sum=sumArray(arr,i+1);
        return sum+arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        System.out.println(sumArray(arr,0));
    }
}
