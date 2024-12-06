package CodeForces;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count >= 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("NO");
    }
}
