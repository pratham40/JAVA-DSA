package CodeForces;

import java.util.Scanner;

public class Chips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int walrus = sc.nextInt();
        int chips = sc.nextInt();
        int sum = 0;
        int index = 0;
        for (int i = 0; i < chips; i++) {
            for (int j = 1; j <= walrus; j++) {
                sum += j;
                index = j;
                if (sum > chips) {
                    break;
                }
            }
            if (chips == sum) {
                System.out.println(0);
                return;
            }
            if (chips - sum < 0) {
                System.out.println(chips - (sum - index));
                return;
            }
        }
    }
}
