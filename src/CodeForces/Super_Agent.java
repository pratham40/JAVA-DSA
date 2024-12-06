package CodeForces;

import java.util.Scanner;

public class Super_Agent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            String s = sc.next();
            arr[i] = s.toCharArray();
        }
        boolean symmetric = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[2 - i][2 - j]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
