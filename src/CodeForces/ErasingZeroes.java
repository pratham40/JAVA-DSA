package CodeForces;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s = sc.next();
            int prev=-1;
            int ans=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='1'){
                    if (prev!=-1){
                        ans+=i-prev-1;
                    }
                    prev=i;
                }
            }
            System.out.println(ans);
        }
    }
}
