package CodeForces;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int diff = arr[i] - '0';
            if (i==0 && diff==9){
                continue;
            }
            if (diff > 4) {
                arr[i] = (char) ((9 - diff) + '0');
            }
        }
        System.out.println(new String(arr));
    }
}
