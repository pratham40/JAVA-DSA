package BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(findMinimum(a));
    }

    private static int findMinimum(int[] a) {
        int start = 0;
        int end = a.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[a.length - 1] >= a[mid]) {
                ans = a[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
