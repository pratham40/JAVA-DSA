package CodeForces;

import java.util.Scanner;

public class KevinAndCombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int x = sc.nextInt();
            while (x>=0){
                String str = String.valueOf(x);
                if (str.contains("33") && x!=33){
                    str=str.replace("33","");
                    x=Integer.parseInt(str);
                }else {
                    x-=33;
                }

                if (x==0){
                    System.out.println("Yes");
                    break;
                }
            }
           if (x!=0){
               System.out.println("No");
           }
        }
    }
}
