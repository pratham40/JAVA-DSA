package CodeForces;

import java.util.Scanner;

public class SystemAdministrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s1 = 0;
        int d1 = 0;
        int s2 = 0;
        int d2 = 0;
        while (t-- > 0) {
            int description = sc.nextInt();
            int sendPacket = sc.nextInt();
            int discardPacket = sc.nextInt();
            if (description == 1) {
                s1 += sendPacket;
                d1 += discardPacket;
            } else {
                s2 += sendPacket;
                d2 += discardPacket;
            }
        }
        if (s1 >= d1) {
            System.out.println("LIVE");
        } else {
            System.out.println("DEAD");
        }
        if (s2 >= d2) {
            System.out.println("LIVE");
        } else {
            System.out.println("DEAD");
        }
    }
}