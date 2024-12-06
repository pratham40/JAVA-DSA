package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while (t-->0){
            int[] arr=new int[3];
            for (int i = 0; i <3 ; i++) {
                arr[i]= sc.nextInt();
            }
            int sum= Arrays.stream(arr).sum();
            if (sum>1){
                count++;
            }
        }
        System.out.println(count);
    }
}
