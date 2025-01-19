package CodeForces;

import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a4=sc.nextInt();
            int a5=sc.nextInt();
            int temp1=a1+a2;
            int temp2=a4-a2;
            int temp3=a5-a4;
            int count1=0;
            int count2=0;
            int count3=0;
            if (temp1==a1+a2){
                count1++;
            }
            if(a4==a2+temp1){
                count1++;
            }
            if (a5==temp1+a4){
                count1++;
            }
            if (temp2==a1+a2){
                count2++;
            }
            if(a4==a2+temp2){
                count2++;
            }
            if (a5==temp2+a4){
                count2++;
            }
            if (temp3==a1+a2){
                count3++;
            }
            if(a4==a2+temp3){
                count3++;
            }
            if (a5==temp3+a4){
                count3++;
            }
            System.out.println(Math.max(Math.max(count1,count2),count3));
        }
    }
}
