package CodeForces;

import java.util.Scanner;

public class RomaAndLuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            String s = "" + arr[i];
            for (char a : s.toCharArray()) {
                if (a == '4' || a == '7') {
                    count++;
                }
            }
            if (count <= k) {
                ans++;
            }
        }
        System.out.print(ans);
    }
}
