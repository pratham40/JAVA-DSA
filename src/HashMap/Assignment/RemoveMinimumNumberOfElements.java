package HashMap.Assignment;

import java.util.HashMap;

public class RemoveMinimumNumberOfElements {
    public static long minRemove(long a[], long b[], long n, long m) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(map);
        long count = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(b[i])) {
                int val = map.get(b[i]);
                val--;
                count++;
                if (val == 0) {
                    map.remove(b[i]);
                } else {
                    map.put(b[i], val);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long[] A = {4, 3, 4, 4, 4};
        long[] B = {2, 4};
        System.out.println(minRemove(A, B, A.length, B.length));
    }
}
