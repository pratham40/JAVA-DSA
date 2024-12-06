package CodeForces;

import java.util.Scanner;

public class Haiku {
    public static int checkSyllables(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isHaiku(String str1, String str2, String str3) {
        return checkSyllables(str1) == 5 && checkSyllables(str2) == 7 && checkSyllables(str3) == 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        if (isHaiku(str1, str2, str3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
