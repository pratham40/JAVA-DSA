package CodeForces;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <=n; i++) {
            int x = sc.nextInt();
            arr[x-1]=i;
        }
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
