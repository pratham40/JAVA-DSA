package Recursion;

import java.util.Scanner;

public class indices {

    static void printIndices(int[] arr,int i,int target){
        if (i==arr.length){
            return;
        }
        if (arr[i]==target){
            System.out.print(i+" ");
        }
        printIndices(arr,i+1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,2,2,5};
        int target = sc.nextInt();
        printIndices(arr,0,target);
    }
}
