package CodeForces;
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int w= sc.nextInt();
        int remain_cost=(w*k*(w+1))/2;
        int var= (remain_cost>n)? (remain_cost-n):0;
        System.out.println(var);
    }
}