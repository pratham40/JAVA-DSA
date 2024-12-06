public class ShellSort {
    public static void main(String[] args) {
        int[] arr ={7,5,9,6,12,11,13,15};
        shellSort(arr);
    }

    private static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap/=2) {
            for (int i = gap; i < n; i++) {
                int temp=arr[i];
//                for (int j =i-gap;j<n;j--) {
//                    if
//                }
            }
        }
    }
}
