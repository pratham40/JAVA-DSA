package Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};
/*        basicCountSort(arr);
        System.out.println(Arrays.toString(arr));*/
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] output = new int[arr.length];
        int[] count = new int[max + 1];
//        Frequency Array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
//        Prefix Array
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i - 1] + count[i];
        }
        for (int i = arr.length-1; i >=0; i--) {
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=output[i];
        }
    }

    private static void basicCountSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    private static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > mx) {
                mx = j;
            }
        }
        return mx;
    }
}
