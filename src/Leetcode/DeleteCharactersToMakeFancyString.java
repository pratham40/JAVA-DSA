package Leetcode;

public class DeleteCharactersToMakeFancyString {
    public static String makeFancyString(String s) {
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(ans.length()<2){
                ans.append(s.charAt(i));
            }
            else if( ans.charAt(i-1)==s.charAt(i) && ans.charAt(i-2)!=s.charAt(i)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String ans = makeFancyString("leeetcode");
        System.out.println(ans);
    }
}
