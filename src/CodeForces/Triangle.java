package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        if (arr[0]+arr[1]>arr[2] || arr[1]+arr[2]>arr[3]){
            System.out.println("TRIANGLE");
        } else if (arr[0]+arr[1]==arr[2] || arr[1]+arr[2]==arr[3]) {
            System.out.println("SEGMENT");
        }else {
            System.out.println("IMPOSSIBLE");
        }
    }
}