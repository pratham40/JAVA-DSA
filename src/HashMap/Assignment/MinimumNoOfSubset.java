package HashMap.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumNoOfSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 3,4,4,4,5};
        System.out.println(minimumNoOfSubset(arr));
    }

    private static int minimumNoOfSubset(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int max=1;
        for (var key:map.keySet()){
            if (map.get(key)>max){
                max=map.get(key);
            }
        }
        return max;
    }
}
