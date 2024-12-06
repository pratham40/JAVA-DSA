package HashMap.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumFreqInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                map.put(ch,map.get(ch)+1);
            }
        }
        int min=Integer.MAX_VALUE;
        char ch = Character.MAX_VALUE;
        for (var key:map.keySet()){
            if (map.get(key)<min){
                min=map.get(key);
                ch=key;
            }
        }
        System.out.println(ch);
    }
}