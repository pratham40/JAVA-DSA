package CodeForces;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            if ((sum - arr[i]) % 2 == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
