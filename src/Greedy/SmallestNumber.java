package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=sc.nextInt();
        int digit=sc.nextInt();
        if (sum>digit*9){
            System.out.println(false);
            return;
        }
        sum-=1;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < digit; i++) {
            ans.add(0);
        }
        ans.set(0,1);
        for (int i = digit-1; i >=0 ; i--) {
            if (sum>9){
                ans.set(i,9);
                sum-=9;
            }else {
                if (ans.get(i)>0) {
                    ans.set(i, ans.get(i) + sum);
                }else {
                    ans.set(i,sum);
                }
                break;
            }
        }
        System.out.println(ans);
    }
}
