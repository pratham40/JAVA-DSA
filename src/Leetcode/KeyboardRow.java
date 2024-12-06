package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    static boolean checkWord(String word,String str){
        for(int i=0;i<word.length();i++){
            String s=String.valueOf(word.charAt(i));
            if(!str.contains(s)){
                return false;
            }
        }
        return true;
    }
    public static String[] findWords(String[] words) {
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        List<String> ans = new ArrayList<>();
        for(String word:words){
            String w=word.toLowerCase();
            String c=String.valueOf(w.charAt(0));
            if(str1.contains(c)){
                if(checkWord(w,str1)){
                    ans.add(word);
                }
            }else if(str2.contains(c)){
                if(checkWord(w,str1)){
                    ans.add(word);
                }
            }else if(str3.contains(c)){
                if(checkWord(w,str1)){
                    ans.add(word);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] words={"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}
