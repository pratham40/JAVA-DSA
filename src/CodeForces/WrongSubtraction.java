package CodeForces;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int check=n%10;
            if (check==0){
                n/=10;
            }else {
                n-=1;
            }
        }
        System.out.println(n);
    }
}
