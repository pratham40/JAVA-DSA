package CodeForces;

import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        int temp=1;
        for (int i = 0; i < n; i++) {
            sb.append(str.charAt(i));
            i+=temp;
            temp++;
        }
        System.out.println(sb.toString());
    }
}
