package Recursion;

import java.util.Scanner;

public class last_index {

    static void lastIndex(int[] arr,int i,int target){
        if (i<0){
            return ;
        }
        if (target==arr[i]){
            System.out.println(i);
        }
        lastIndex(arr,i-1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={45,12,75,23};
        int target= sc.nextInt();
        lastIndex(arr,arr.length-1,target);
    }
}
