package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class find_all_indices_arraylist {

    /* target =2 */
    static ArrayList<Integer> allIndices(int[] arr, int i, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        if (i==arr.length){
            return new ArrayList<>();
        }
        if (arr[i]==target){ /*  1   */
            ans.add(i);
        }
        ArrayList<Integer> res=allIndices(arr,i+1,target);/* 3 4*/
        ans.addAll(res);/*1 3 4 */
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        int[] arr={1,2,3,2,2,5};
        ArrayList<Integer> ans = allIndices(arr,0,target);
        for (Integer i :ans) {
            System.out.print(i+" ");
        }

    }
}
