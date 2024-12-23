package CodeForces;

import java.util.Scanner;

public class PreparingForTheOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            int diff=0;
            for (int i = 0; i < n; i++) {
                if (i<n-1 && a[i]>b[i+1]){
                    diff+=a[i]-b[i+1];
                } else if (i == n - 1) {
                    diff+=a[i];
                }
            }
            System.out.println(diff);
        }
    }
}
