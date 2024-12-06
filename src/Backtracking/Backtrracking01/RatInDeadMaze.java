package Backtracking.Backtrracking01;

public class RatInDeadMaze {
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        int[][] maze={
                {1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}
        };
        print(0,0,rows-1,cols-1,"",maze);
    }

    private static void print(int sr, int sc, int er, int ec,String res ,int[][] maze) {
        if (sr>er || sc>ec){
            return;
        }
        if (sr==er && sc == ec){
            System.out.println(res);
            return;
        }
        if (maze[sr][sc]==0){
            return;
        }
        // Go right
        print(sr,sc+1,er,ec,res.concat("R"),maze);
        // Go Down
        print(sr+1,sc,er,ec,res.concat("D"),maze);
    }
}
