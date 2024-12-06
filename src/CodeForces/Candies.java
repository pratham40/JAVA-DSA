package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int rem = n % m;
        int ans = n / m;
        if (rem == 0) {
            Arrays.fill(arr, ans);
        } else {
            for (int i = 0; i < m; i++) {
                if (rem > 0) {
                    arr[i] = n / m + 1;
                } else {
                    arr[i] = n / m;
                }
                rem--;
            }
        }
        Arrays.sort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
