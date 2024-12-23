package CodeForces;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int day=0;
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum=a+b+c;

            day=(n/sum)*3;

            int remain=n%sum;

            if (remain>0){
                day++;
                remain-=a;
            }
            if (remain>0){
                day++;
                remain-=b;
            }
            if (remain>0){
                day++;
            }
            System.out.println(day);
        }
    }
}
