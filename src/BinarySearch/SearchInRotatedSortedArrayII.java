package BinarySearch;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 2, 2, 3, 1};
        int target = 2;
        System.out.println(searchII(nums, target));
    }

    private static boolean searchII(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } else if (nums[mid] <= nums[end]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}
