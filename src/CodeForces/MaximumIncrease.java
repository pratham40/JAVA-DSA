package CodeForces;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int maxLength=1;
        int currLength=1;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]<arr[i+1]){
                currLength++;
            }else {
                currLength=1;
            }
            maxLength=Math.max(maxLength,currLength);
        }
        System.out.println(maxLength);
    }
}
