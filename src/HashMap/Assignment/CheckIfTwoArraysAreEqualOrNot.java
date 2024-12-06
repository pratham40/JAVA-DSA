package HashMap.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(checkIfTwoArraysAreEqualOrNot(arr1, arr2));
    }

    private static int checkIfTwoArraysAreEqualOrNot(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int j : arr2) {
            if (!map.containsKey(j)) {
                return 0;
            } else {
                int val = map.get(j);
                val--;
                if (val == 0) map.remove(j);
                else map.put(j, val);
            }
        }
        return 1;
    }
}
