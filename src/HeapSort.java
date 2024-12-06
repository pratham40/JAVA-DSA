import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1, 9};
        createHeap(arr);
        System.out.println();
        int end = arr.length - 1;
        while (end > 0) {
            swap(0, end, arr);
            downHeapify(arr, 0);
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void downHeapify(int[] arr, int pi) {
        int idx = pi;
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        if (lci < arr.length && arr[idx] < arr[lci]) {
            idx = lci;
        }
        if (rci < arr.length && arr[idx] < arr[rci]) {
            idx = rci;
        }
        if (idx != pi) {
            swap(pi, idx, arr);
            downHeapify(arr, idx);
        }
    }

    private static void createHeap(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            unheapify(ans, i);
        }
        System.arraycopy(ans, 0, arr, 0, arr.length);
    }

    private static void unheapify(int[] ans, int ci) {
        int pi = (ci - 1) / 2;
        if (pi == ci) {
            return;
        }
        if (ans[pi] < ans[ci]) {
            swap(pi, ci, ans);
        }
        unheapify(ans, pi);
    }

    private static void swap(int pi, int ci, int[] ans) {
        int temp = ans[pi];
        ans[pi] = ans[ci];
        ans[ci] = temp;
    }
}
