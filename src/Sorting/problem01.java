package Sorting;

import java.util.Arrays;

/**
 * Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in
 * linear time. Assume there are no duplicates in the array.
 * For example,
 * Input: A[] = [3, 8, 6, 7, 5, 9, 10]
 * Output: A[] = [3, 5, 6, 7, 8, 9, 10]
 */
public class problem01 {
    public static void sortArray(int[] nums) {
        int x = -1;
        int y = -1;
        if (nums.length <= 1) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 6, 7, 8, 9, 3};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
