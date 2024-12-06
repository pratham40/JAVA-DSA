package Geek_For_Geek;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {

        // add your code here
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;

    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {1, 2, 3, 4, 5};
        int m = 5;
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> ans = findUnion(arr1, arr2, n, m);
        System.out.println(ans);

    }
}
