package Sorting;

import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,5,4,1,3};
        int[] sortedArray=selectionSort(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_index=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if (min_index!=i) {
                swap(arr,min_index,i);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int minIndex,int i) {
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
}
