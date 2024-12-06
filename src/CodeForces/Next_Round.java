package CodeForces;

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        int count=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>=a[k-1] && a[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
