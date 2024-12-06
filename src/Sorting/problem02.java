package Sorting;

import java.util.Arrays;

/***Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 Input:
 N = 6
 arr[]= {0 2 1 2 0 0}
 Output:0 0 0 1 2 1
 ****/
public class problem02 {
    public static void swapInArray(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
//  Dutch National Flag Algorithm
        int[] arr = {0, 2, 1, 2, 0, 0};
        sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortZeroOneTwo(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 0) {
                swapInArray(arr, low, mid);
                low++;
                mid++;
            } else {
                swapInArray(arr, mid, high  );
                high--;
            }
        }
    }
}
