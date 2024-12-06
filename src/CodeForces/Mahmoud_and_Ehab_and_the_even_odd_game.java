package CodeForces;

import java.util.Scanner;

public class Mahmoud_and_Ehab_and_the_even_odd_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String ans=(n%2==0)?"Mahmoud":"Ehab";
        System.out.println(ans);
    }
}
