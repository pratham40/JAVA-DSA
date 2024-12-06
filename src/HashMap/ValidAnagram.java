package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram2(str1, str2));

    }

    static HashMap<Character, Integer> makeFreq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = makeFreq(str1);
        HashMap<Character, Integer> map2 = makeFreq(str2);
        return map1.equals(map2);
    }
    static boolean isAnagram2(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = makeFreq(str1);
        for (int i = 0; i < str2.length(); i++) {
            Character ch = str2.charAt(i);
            if (!map1.containsKey(ch)){
                return false;
            }
            int currFreq= map1.get(ch);
            map1.put(ch,currFreq-1);
        }
        for(var i : map1.values()){
            if (i!=0){
                return false;
            }
        }
        return true;
    }
}
