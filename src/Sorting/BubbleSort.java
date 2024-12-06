package Sorting;

import java.util.Arrays;

public class BubbleSort {



    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    /* optimizedBubbleSort*/

    static int[] optimizedBubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean flag=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=true;
                }
            }
            if (!flag){
                return arr;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr= {100, 44, 1, 445, 74, 22};
        int[] sortedArray=bubbleSort(arr);
        int[] sortedArray1=optimizedBubbleSort(arr);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(sortedArray1));
    }
}
