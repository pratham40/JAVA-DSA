package CodeForces;

import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0 && isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
}
