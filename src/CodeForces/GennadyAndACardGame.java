package CodeForces;

import java.util.Scanner;

public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String onTable = sc.next();
        String card1 = sc.next();
        String card2 = sc.next();
        String card3 = sc.next();
        String card4 = sc.next();
        String card5 = sc.next();
        char rank = onTable.charAt(0);
        char suit = onTable.charAt(1);
        if (card1.charAt(0) == rank || card1.charAt(1) == suit || card2.charAt(0) == rank || card2.charAt(1) == suit || card3.charAt(0) == rank || card3.charAt(1) == suit || card4.charAt(0) == rank || card4.charAt(1) == suit || card5.charAt(0) == rank || card5.charAt(1) == suit) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
