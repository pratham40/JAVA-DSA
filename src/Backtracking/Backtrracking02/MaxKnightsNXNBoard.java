package Backtracking.Backtrracking02;

public class MaxKnightsNXNBoard {
    static int max=-1;
    static int nKnights=5;
    public static boolean isSafe(char[][] board,int row,int col){
        int n = board.length;
        int i,j;
        // 2 up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && board[i][j]=='K'){
            return false;
        }
        // 2 up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j]=='K'){
            return false;
        }
        // 2 down 1 right
        i=row+2;
        j=col+1;
        if(i<n && j<n && board[i][j]=='K'){
            return false;
        }
        // 2 down 1 left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j]=='K'){
            return false;
        }
        // 2 right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j]=='K'){
            return false;
        }
        // 2 right 1 down
        i=row+1;
        j=col+2;
        if(i<n && j<n && board[i][j]=='K'){
            return false;
        }
        // 2 Left  1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j]=='K'){
            return false;
        }
        // 2 left 1 down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j]=='K'){
            return false;
        }
        return true;
    }
    public static void nKnights(char[][] board,int row,int col,int numOfKnights){
        int n = board.length;
        if (row==n){
            if (numOfKnights==nKnights){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            max=Math.max(numOfKnights,max);
            return;
        }
        else if (isSafe(board,row,col)){
            board[row][col]='K';
            if (col!=n-1)  nKnights(board,row,col+1,numOfKnights+1);
            else nKnights(board,row+1,0,numOfKnights+1);
            board[row][col]='X';
        }
        if (col<n-1)  nKnights(board,row,col+1,numOfKnights);
        else nKnights(board,row+1,0,numOfKnights);
    }
    public static void main(String[] args) {
        int n = 3;
        char[][] board= new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]='X';
            }
        }
        nKnights(board,0,0,0);
        System.out.println(max);
    }
}
