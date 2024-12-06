package Recursion;

public class max_array {

    static int maxArray(int[] arr,int i){
        if (i==arr.length-1){
            return arr[i];
        }
        int max=maxArray(arr,i+1);
        return Math.max(arr[i],max);
    }

    public static void main(String[] args) {
        int[] arr={23,56,24,67,66,43};
        System.out.println(maxArray(arr,0));
    }
}
