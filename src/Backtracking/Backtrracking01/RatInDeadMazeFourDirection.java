package Backtracking.Backtrracking01;

import java.util.ArrayList;

public class RatInDeadMazeFourDirection {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int rows=maze.length;
        int cols=maze[0].length;
        boolean[][] isVisited=new boolean[rows][cols];
//        print(0,0,rows-1,cols-1,"",maze,isVisited);
        ArrayList<String> ans= new ArrayList<>();
        print1(0,0,rows-1,cols-1,"",maze,isVisited,ans);
        System.out.println(ans);
    }

    private static void print1(int sr, int sc, int er, int ec, String res, int[][] maze, boolean[][] isVisited, ArrayList<String> ans) {
        if (sr<0 || sc<0){
            return;
        }
        if (sr>er || sc>ec){
            return;
        }
        if (sr==er && sc==ec){
            System.out.println(res);
            ans.add(res);
            return;
        }
        if (maze[er][ec]==0){
            return;
        }
        if (maze[sr][sc]==0){
            return;
        }
        if (isVisited[sr][sc]) {
            return;
        }
        isVisited[sr][sc]=true;
        // Down
        print1(sr+1,sc,er,ec,res.concat("D"),maze,isVisited,ans);
        // Right
        print1(sr,sc+1,er,ec,res.concat("R"),maze,isVisited,ans);
        // Up
        print1(sr-1,sc,er,ec,res.concat("U"),maze,isVisited,ans);
        // Left
        print1(sr,sc-1,er,ec,res.concat("L"),maze,isVisited,ans);
        // backtrack
        isVisited[sr][sc]=false;
    }

    private static void print(int sr, int sc, int er, int ec, String res, int[][] maze,boolean[][] isVisited) {
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
        if (isVisited[sr][sc]) {
            return;
        }
        isVisited[sr][sc]=true;
        // Down
        print(sr+1,sc,er,ec,res.concat("D"),maze,isVisited);
        // Right
        print(sr,sc+1,er,ec,res.concat("R"),maze,isVisited);
        // Up
        print(sr-1,sc,er,ec,res.concat("U"),maze,isVisited);
        // Left
        print(sr,sc-1,er,ec,res.concat("L"),maze,isVisited);
        // backtrack
        isVisited[sr][sc]=false;
    }

}
