package Strings;

public class remove_occurrences {
    public static void main(String[] args) {
        String ans="";
        String s="abcax";
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!='a'){
                ans=ans+s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
