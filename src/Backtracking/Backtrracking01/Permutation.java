package Backtracking.Backtrracking01;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
//        printPermutation(str,"");
        List<String> ans = new ArrayList<>();
        printPermutation1(str,"",ans);
        for (String ss:ans){
            System.out.println(ss);
        }
    }

    private static void printPermutation1(String str, String t,List<String> ans) {
        if (str.isEmpty()){
            ans.add(t);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftPart=str.substring(0,i);
            String rightPart=str.substring(i+1);
            String rem=leftPart+rightPart;
            printPermutation(rem,t+ch);
        }
    }

    private static void printPermutation(String str, String t) {
        if (str.isEmpty()){
            System.out.println(t);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftPart=str.substring(0,i);
            String rightPart=str.substring(i+1);
            String rem=leftPart+rightPart;
            printPermutation(rem,t+ch);
        }
    }
}
