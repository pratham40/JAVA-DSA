package Backtracking.Backtrracking01;

public class MazePath4Direction {
    private static void mazePath(int str, int stc, int er, int ec,String res,boolean[][] isVisited) {
        if (str<0 || stc<0){
            return;
        }
        if (str>er || stc>ec){
            return ;
        }
        if (isVisited[str][stc]){
            return;
        }
        if (str==er && stc==ec){
            System.out.println(res);
            return;
        }
        isVisited[str][stc]=true;
        mazePath(str+1,stc,er,ec,res.concat("D ->"),isVisited);
        mazePath(str,stc+1,er,ec,res.concat("R ->"),isVisited);
        mazePath(str,stc-1,er,ec,res.concat("L ->"),isVisited);
        mazePath(str-1,stc,er,ec,res.concat("U ->"),isVisited);
//        backtrack
        isVisited[str][stc]=false; 
    }

    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean[][] isVisited=new boolean[rows][cols];
        mazePath(0,0,rows-1,cols-1,"",isVisited);

    }
}
