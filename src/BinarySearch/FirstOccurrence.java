package BinarySearch;

public class FirstOccurrence {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                firstOccurrence = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 5, 5, 5, 5, 6, 6, 6};
        int target = 5;
        System.out.printf("%d found at index %d", target, binarySearch(arr, target));
    }
}
