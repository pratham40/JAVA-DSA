package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr.length == 1) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        int max = arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            sum += max - arr[i];
        }
        System.out.println(sum);
    }
}
