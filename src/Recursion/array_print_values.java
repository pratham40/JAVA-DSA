package Recursion;


import java.util.Arrays;

public class array_print_values {

    static void printValues(int[] arr,int i){
        if (i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        printValues(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.sort(arr);
        printValues(arr,0);
    }
}
