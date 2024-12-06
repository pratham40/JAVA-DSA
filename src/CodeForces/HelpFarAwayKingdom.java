package CodeForces;

import java.util.Scanner;

public class HelpFarAwayKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String no = sc.nextLine();
        String[] parts = no.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts[1];
        char lastDigit = integerPart.charAt(integerPart.length() - 1);
        if (lastDigit != '9') {
            if (fractionalPart.charAt(0) < '5') {
                System.out.println(integerPart);
            } else {
                System.out.println(Integer.parseInt(integerPart) + 1);
            }
        } else {
            System.out.println("GOTO Vasilisa.");
        }
    }
}