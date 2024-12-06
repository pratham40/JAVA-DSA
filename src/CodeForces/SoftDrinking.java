package CodeForces;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int ans1 = (k * l) / nl;
        int ans2 = c * d;
        int ans3 = p / np;
        int ans = Math.min(ans1, ans2);
        ans = Math.min(ans, ans3);
        System.out.print(ans / n);
    }
}
