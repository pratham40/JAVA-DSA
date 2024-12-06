package CodeForces;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n % 2 != 0) {
            System.out.println(-1);
        } else {
            for (int i = 1; i < n; i += 2) {
                arr[i - 1] = i + 1;
                arr[i] = i;
            }
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }
}
