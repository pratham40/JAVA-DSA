package HashMap;

import java.util.HashMap;

public class LargestSubarray0Sum {
    static int largestSubarray0Sum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1};

    }
}
