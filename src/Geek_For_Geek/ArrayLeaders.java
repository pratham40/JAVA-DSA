package Geek_For_Geek;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static ArrayList<Integer> leaders(int n, int[] arr) {
        // Your code here
        ArrayList<Integer> ls = new ArrayList<>();
        int i= arr.length-2;
        int idx=0;
        ls.add(arr[arr.length-1]);
        while (i>=0){
            if (arr[i]>ls.get(idx)){
                ls.add(arr[i]);
                idx++;
            }
            i--;
        }
        Collections.reverse(ls);
        return ls;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr.length,arr));
    }
}
