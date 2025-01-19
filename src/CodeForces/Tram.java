package CodeForces;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxPassenger=0;
        int initialCapacity=0;
        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            initialCapacity=enter-exit+initialCapacity;
            maxPassenger= Math.max(initialCapacity,maxPassenger);
        }
        System.out.println(maxPassenger);
    }
}
