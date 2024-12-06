package Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 2};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int max = findMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    private static void countSort(int[] arr, int place) {
        int[] output = new int[arr.length];
        int[] count = new int[10];
//        Frequency Array
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }
//        Prefix Sum
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
//        Count Sort
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    private static int findMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}