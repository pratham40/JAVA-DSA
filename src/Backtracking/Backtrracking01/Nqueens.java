package Backtracking.Backtrracking01;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board=new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
        }
        nQueens(board,0);
    }

    private static void nQueens(char[][] board, int i) {

    }
}
