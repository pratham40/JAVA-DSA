package CodeForces;

import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char[] a=s.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]!='+'){
                    if (a[j]>a[j+2]){
                        char temp=a[j+2];
                        a[j+2]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
        System.out.println(a);
    }
}
