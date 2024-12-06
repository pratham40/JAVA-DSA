package CodeForces;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr= new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.next();
        }
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals("X++") || arr[i].equals("++X")){
                count++;
            }
            if (arr[i].equals("X--") || arr[i].equals("--X")){
                count--;
            }
        }
        System.out.println(count);
    }
}
