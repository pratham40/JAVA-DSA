package Backtracking.Backtrracking01;

public class RatInDeadMazeFourDirectionOptimized {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int rows = maze.length;
        int cols = maze[0].length;
//        boolean[][] isVisited = new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",maze);
    }

    private static void print(int sr, int sc, int er, int ec, String res, int[][] maze) {
        if (sr<0 || sc<0){
            return;
        }
        if (sr>er || sc>ec){
            return;
        }
        if (sr==er && sc==ec){
            System.out.println(res);
            return;
        }
        if (maze[sr][sc]==0){
            return;
        }
        if (maze[sr][sc]==-1) {
            return;
        }
        maze[sr][sc]=-1;
        // Down
        print(sr+1,sc,er,ec,res.concat("D"),maze);
        // Right
        print(sr,sc+1,er,ec,res.concat("R"),maze);
        // Up
        print(sr-1,sc,er,ec,res.concat("U"),maze);
        // Left
        print(sr,sc-1,er,ec,res.concat("L"),maze);
        // backtrack
        maze[sr][sc]=1;
    }
}
