package BinarySearch;

public class ChocolateDistribution {
    static boolean divisionPossible(int[] a, int m, int mxChocAllowed) {
        int noOfStudent = 1;
        int choc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mxChocAllowed) {
                return false;
            }
            if (choc + a[i] <= mxChocAllowed) {
                choc += a[i];
            } else {
                choc = a[i];
                noOfStudent++;
            }
        }
        return noOfStudent <= m;
    }

    static int distributeChocolate(int[] a, int m) {
        if (a.length < m) {
            return -1;
        }
        int ans = 0;
        int start = 1;
        int end = (int) 1e9;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (divisionPossible(a, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        int m = 3;
        System.out.println(distributeChocolate(a, m));
    }
}
