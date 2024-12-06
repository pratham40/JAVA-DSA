package CodeForces;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        if (pass.length() >= 5) {
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isUpperCase(pass.charAt(i))) {
                    isUpper = true;
                } else if (Character.isLowerCase(pass.charAt(i))) {
                    isLower = true;
                } else if (Character.isDigit(pass.charAt(i))) {
                    isDigit = true;
                }
            }
            if (isDigit && isUpper && isLower) {
                System.out.println("Correct");
            } else {
                System.out.println("Too weak");
            }
        } else {
            System.out.println("Too weak");
        }
    }
}
