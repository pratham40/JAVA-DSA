package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestPalindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> freq = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            freq.add(0);
        }
        for (int i = 0; i < s.length(); i++) {
            int dig = (s.charAt(i)-'0');
            freq.set(dig,freq.get(dig)+1);
        }

        if (!validate(freq)){
            System.out.println("Palindrome not possible");
        }
        String firstHalf = "";
        for (int i = 9; i >=0; i--) {
            while (freq.get(i)>1){
                firstHalf+=i;
                freq.set(i,freq.get(i)-2);
            }
        }
        StringBuilder secondHalf = new StringBuilder(firstHalf);
        secondHalf.reverse();
        for (int i = 9; i >=0 ; i--) {
            if (freq.get(i)==1){
                firstHalf+=i;
            }
        }
        String ans = firstHalf+secondHalf;
        System.out.println(ans);
    }

    private static boolean validate(List<Integer> freq) {
        boolean odd=false;
        for (int i = freq.size()-1; i >=0; i--) {
            if (freq.get(i)%2!=0){
                if (odd){
                    return false;
                }
                odd=true;
            }
        }
        return true;
    }

}
