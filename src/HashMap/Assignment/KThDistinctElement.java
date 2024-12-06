package HashMap.Assignment;

import java.util.HashMap;

public class KThDistinctElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(kThDistinctElement(arr, 2));
    }

    private static int kThDistinctElement(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                count++;
            }
            if (count == k) {
                return arr[i];
            }
        }
        return -1;
    }
}
