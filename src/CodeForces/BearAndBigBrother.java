package CodeForces;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=0;
        int limakWeigh= sc.nextInt();
        int bobWeigh= sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (limakWeigh>bobWeigh){
                System.out.println(year);
                return;
            }
            limakWeigh*=3;
            bobWeigh*=2;
            year++;
        }
    }
}
