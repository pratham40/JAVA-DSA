package CodeForces;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        int count = 0;
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == '4' || n1.charAt(i) == '7') {
                count += 1;
            }
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
