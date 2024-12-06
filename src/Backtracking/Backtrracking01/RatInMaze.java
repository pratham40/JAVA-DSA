package Backtracking.Backtrracking01;

import java.util.Scanner;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols= sc.nextInt();
        int row = sc.nextInt();
        int count = mazePath(1,1,row,cols);
        System.out.println(count);
    }

    private static int mazePath(int str, int stc, int er, int ec) {
        if (str>er || stc>ec){
            return 0;
        }
        if (str==er && stc==ec){
            return 1;
        }
        int downWays=mazePath(str+1,stc,er,ec);
        int rightWays=mazePath(str,stc+1,er,ec);
        int totalWays=downWays+rightWays;
        return totalWays;
    }
}
