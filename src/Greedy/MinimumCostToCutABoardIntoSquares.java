package Greedy;

import java.util.Arrays;

public class MinimumCostToCutABoardIntoSquares {
    public static void main(String[] args) {
        int m = 6,n=4;
        int[] X= {2,1,3,1,4}; // vertical
        int[] Y= {4,1,2}; // horizontal
        Arrays.sort(X); // MLOG+NLOG
        Arrays.sort(Y);
        reverse(X);
        reverse(Y);
        int no_Of_Vertical_Piece=1;
        int no_Of_Horizontal_Piece=1;
        int totalCost=0;
        int i=0,j=0;
        while (i<m-1 && j<n-1){
            if (X[i]>Y[j]){
                totalCost+=X[i]*no_Of_Horizontal_Piece;
                no_Of_Vertical_Piece++;
                i++;
            }else {
                totalCost+=Y[j]*no_Of_Vertical_Piece;
                no_Of_Horizontal_Piece++;
                j++;
            }
        }
        while (i<m-1){
            totalCost+=X[i]*no_Of_Horizontal_Piece;
            no_Of_Vertical_Piece++;
            i++;
        }
        while (j<n-1){
            totalCost+=Y[j]*no_Of_Vertical_Piece;
            no_Of_Horizontal_Piece++;
            j++;
        }
        System.out.println(totalCost);
    }

    private static void reverse(int[] x) {
        int i=0;
        int j=x.length-1;
        while (i<j){
            int temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            i++;
            j--;
        }
    }
}
