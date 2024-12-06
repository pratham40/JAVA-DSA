package Recursion;

public class reverse_String {

    static String reverseString(String s){
        if (s.length()==0){
            return "";
        }
        String smallAns=s.substring(1);
        return smallAns+s.charAt(0);
    }

    static String reverseString(String s,int index){
        if (index==s.length()){
            return "";
        }
        String smallAns=reverseString(s,index+1);
        return smallAns+s.charAt(index);
    }

    public static void main(String[] args) {
        String s = "pw skills";
        System.out.println("reverseString = " + reverseString(s,0));
    }
}
