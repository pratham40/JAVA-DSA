package CodeForces;

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int level=1;
        while (n>0){
            n-=sum(level);
            if (n<0){
                break;
            }
            level++;
        }
        System.out.println(level-1);
    }

    private static int sum(int level) {
        return level*(level+1)/2;
    }
}
