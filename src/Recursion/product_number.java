package Recursion;

import java.util.Scanner;

public class product_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(productNumber(x, y));
    }

    private static int productNumber(int x, int y) {
        if (y==1){
            return x;
        }
        return productNumber(x,y-1)+x;
    }
}
