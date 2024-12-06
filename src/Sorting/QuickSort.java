package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={5,13,8,9,10,2,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }
        int pivot_index = partition(arr,left,right);
        quickSort(arr,left,pivot_index-1);
        quickSort(arr,pivot_index+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int cnt=0;
        for (int i = left+1; i <=right; i++) {
            if (arr[i]<=pivot){
                cnt++;
            }
        }
        int pivotIndex=cnt+left;
        swap(arr,left,pivotIndex);
        int i=left,j=right;
        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j++;
            }
            if (i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    private static void swap(int[] arr, int left, int pivotIndex) {
        int temp = arr[left];
        arr[left]=arr[pivotIndex];
        arr[pivotIndex]=temp;
    }
}
