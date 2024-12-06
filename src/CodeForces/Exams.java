package CodeForces;

import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n * 3 > k) {
            System.out.println(n * 3 - k);
        } else {
            System.out.println(0);
        }
    }
}
