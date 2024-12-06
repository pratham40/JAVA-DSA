package Recursion;

public class PalindromeString {

    static boolean reverseString2(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        boolean smallAns = reverseString2(s, left + 1, right - 1);
        if (s.charAt(left) == s.charAt(right) && smallAns) {
            return true;
        } else {
            return false;
        }
    }

    static String reverseString(String s) {
        if (s.length() == 0) {
            return "";
        }
        String smallAns = reverseString(s.substring(1));
        return smallAns + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "DAMAD";
//        String rev=reverseString(s);
        boolean rev = reverseString2(s, 0, s.length() - 1);
        System.out.println(rev);
//        if (s.equals(rev)){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }


    }
}
