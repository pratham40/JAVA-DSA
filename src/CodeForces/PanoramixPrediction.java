package CodeForces;

import java.util.Scanner;

public class PanoramixPrediction {
    static boolean isPrime(int no) {
        if (no < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int isNextPrime(int n) {
        n++;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (isNextPrime(n) == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
