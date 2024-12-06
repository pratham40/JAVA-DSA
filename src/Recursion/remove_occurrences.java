package Recursion;

import java.util.Scanner;

public class remove_occurrences {

    static String removeOccurrencesMethod2(String res){
        if (res.length()==0){
            return "";
        }
        String smallAns=removeOccurrencesMethod2(res.substring(1));
        char ch=res.charAt(0);
        if (ch!='a'){
            return smallAns+ch;
        }
        else {
            return smallAns;
        }
    }

    static String removeOccurrences(String res,int index){
        if (index==res.length()){
            return "";
        }
        
        String smallAns=removeOccurrences(res,index+1);
        char ch= res.charAt(index);
        if (res.charAt(index)!='a'){
            return ch+smallAns;
        }
        else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeOccurrences(s,0));
        System.out.println(removeOccurrencesMethod2(s));
    }
}
