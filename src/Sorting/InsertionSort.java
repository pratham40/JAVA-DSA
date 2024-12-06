package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={7,5,4,1,3};
        int[] sortedArray=insertionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        return arr;
    }
}
