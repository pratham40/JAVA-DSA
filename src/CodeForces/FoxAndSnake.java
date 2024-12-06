package CodeForces;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                str.append("#".repeat(m));
            }
            else {
                if ((i+1)%4==0){
                    str.append('#');
                    str.append(".".repeat(m-1));
                }else {
                    str.append(".".repeat(m-1));
                    str.append('#');
                }
            }
            if (i<n-1){
                str.append("\n");
            }
        }
        System.out.print(str);
    }
}
