package CodeForces;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String str = sc.next();
            int ans=10*(str.charAt(0)-'0'-1)+sum(str.length());
            System.out.println(ans);
        }
    }

    private static int sum(int n) {
        return n*(n+1)/2;
    }
}
