package CodeForces;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String no = sc.next();
        boolean flag = true;
        if (checkLuckyNumber(no, flag)) {
            int mid = n / 2;
            int sumFirst = 0;
            int sumLast = 0;
            for (int i = 0; i < mid; i++) {
                sumFirst += no.charAt(i);
            }
            for (int i = mid; i < n; i++) {
                sumLast += no.charAt(i);
            }
            if (sumFirst == sumLast) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkLuckyNumber(String no, boolean flag) {
        for (int i = 0; i < no.length(); i++) {
            if (no.charAt(i) != '4' && no.charAt(i) != '7') {
                return false;
            }
        }
        return true;
    }
}
