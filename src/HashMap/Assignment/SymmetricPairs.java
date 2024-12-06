package HashMap.Assignment;

import java.util.HashMap;

public class SymmetricPairs {
//    Doubt
    public static void main(String[] args) {
        int[][] arr = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i][1])) {
                if (map.get(arr[i][1]) == arr[i][0]) {
                    System.out.println(arr[i][1] + " " + arr[i][0]);
                }
            }
            else {
                map.put(arr[i][0],arr[i][1]);
            }
        }
    }
}
