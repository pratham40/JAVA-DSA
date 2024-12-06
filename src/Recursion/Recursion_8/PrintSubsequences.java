package Recursion.Recursion_8;

public class PrintSubsequences {

    static void printSubsequences(String s,String currAns){
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
//        To be part of current character
        printSubsequences(remString,currAns+curr);
//        Not to be part of current character
        printSubsequences(remString,currAns);
    }

    public static void main(String[] args) {
        printSubsequences("abc","");
    }
}
