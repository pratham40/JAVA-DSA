package Stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        System.out.println(Arrays.toString(removeConsecutiveSubsequences(arr)));
    }

    private static int[] removeConsecutiveSubsequences(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
            else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
            else if (stack.peek() == arr[i]) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    stack.pop();
                }
            }
        }
        int[] array = new int[stack.size()];
        int m = stack.size();
        for (int i = m - 1; i >= 0; i--) {
            array[i] = stack.pop();
        }
        return array;
    }
}
