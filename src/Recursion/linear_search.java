package Recursion;

import java.util.Scanner;

public class linear_search {

    static int returnIndex(int[] arr,int i,int target){
        if (i==arr.length){
            return -1;
        }
        if (target==arr[i]){
            return i;
        }
        return returnIndex(arr,i+1,target);
    }

    static boolean targetElement(int[] arr,int i,int target){
        if (i==arr.length){
            return false;
        }
        if (target==arr[i]){
            return true;
        }
        return targetElement(arr,i+1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={4,12,54,14,3,8,6,1};
        int target =sc.nextInt();
        System.out.println(targetElement(arr,0,target));
        System.out.println(returnIndex(arr,0,target));
    }
}
