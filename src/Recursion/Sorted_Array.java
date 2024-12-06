package Recursion;

public class Sorted_Array {

    static boolean isSorted(int[] arr,int i){
        if (i==arr.length || arr.length==0){
            return true;
        }
        if (arr[i-1]>arr[i]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {34,35,141,464};
        System.out.println(isSorted(arr,1));
    }
}
