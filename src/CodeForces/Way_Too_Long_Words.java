package CodeForces;

import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String x = sc.next();
            if (x.length()<=10){
                System.out.println(x);
            }
            else {
                int count=0;
                for (int i = 1; i <x.length()-1 ; i++) {
                    count++;
                }
                String y= String.valueOf(count);
                System.out.println(x.charAt(0)+y+x.charAt(x.length()-1));
            }
        }
    }
}