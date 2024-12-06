package BinarySearch;

public class BinarySearch {
//    Recursive Approach
    static boolean recursiveBinarySearch(int[] arr,int start,int end,int target){
        if (start>end){
            return false;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return true;
        }
        else if (arr[mid]<target){
            return recursiveBinarySearch(arr,mid+1,end,target);
        }
        else {
            return recursiveBinarySearch(arr,start,mid-1,target);
        }
    }
    static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 4));
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,2));
    }
}
