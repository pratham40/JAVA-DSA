package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        if (set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}
