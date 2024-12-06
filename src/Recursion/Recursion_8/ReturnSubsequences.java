package Recursion.Recursion_8;

import java.util.ArrayList;

public class ReturnSubsequences {
    static ArrayList<String> getSubsequences(String s){
        ArrayList<String> ans = new ArrayList<>();
//        Base Case:
        if(s.isEmpty()){
            ans.add(" ");
            return ans;
        }
        char ch =s.charAt(0);
        ArrayList<String> smallAns=getSubsequences(s.substring(1));
        for (String ss:smallAns){
            ans.add(ch+ss);
            ans.add(ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSubsequences("abc");
        for (String ss:ans){
            System.out.println(ss);
        }

    }
}
