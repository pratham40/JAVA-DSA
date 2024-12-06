package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(isIsomorphic(str1,str2));
    }

    private static boolean isIsomorphic(String str1, String str2) {
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            Character ch1 = str1.charAt(i);
            Character ch2 = str2.charAt(i);
            if (!map.containsKey(ch1)){
                map.put(ch1,ch2);
            }
            else {
                if (!(map.get(ch1)==ch2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
