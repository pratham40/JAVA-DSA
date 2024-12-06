package Backtracking.Backtrracking01;

import java.util.Scanner;

public class PrintPath {
    private static void mazePath(int str, int stc, int er, int ec,String res) {
        if (str>er || stc>ec){
            return ;
        }
        if (str==er && stc==ec){
            System.out.println(res);
            return;
        }
        mazePath(str+1,stc,er,ec,res.concat("D ->"));
        mazePath(str,stc+1,er,ec,res.concat("R ->"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols= sc.nextInt();
        int row = sc.nextInt();
        mazePath(1,1,row,cols,"");
    }
}
