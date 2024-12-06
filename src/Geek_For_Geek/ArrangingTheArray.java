package Geek_For_Geek;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrangingTheArray {
    public static void Rearrange(int a[], int n)
    {

    }
    public static void Rearrange2(int a[], int n)
    {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int j : a) {
            if (j >= 0) {
                pos.add(j);
            } else {
                neg.add(j);
            }
        }
        int idx=0;
        for (int num:neg){
            a[idx++]=num;
        }
        for (int num:pos){
            a[idx++]=num;
        }
    }
    public static void main(String[] args) {
        int N = 9;
        int[] Arr = {0, 7 ,-7 ,3 ,2 ,9, 3, -1, -6};
        Rearrange(Arr,Arr.length);
//        -7 -1 -6 0 7 3 2 9 3
        System.out.println(Arrays.toString(Arr));
    }
}
