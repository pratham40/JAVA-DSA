package CodeForces;

import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            int n = sc.nextInt();
            String x = "" + n;
            int[] ans = new int[x.length()];
            for (int i = 0; i < ans.length; i++) {
                if (x.charAt(i) != '0') {
                    count++;
                    int last_digit = x.length() - 1 - i;
                    ans[i] = (int) ((x.charAt(i) - '0') * Math.pow(10, last_digit));
                }
            }
            System.out.println(count);
            for (int val : ans) {
                if (val != 0) {
                    System.out.print(val + " ");
                }
            }
            System.out.println();

        }
    }
}
