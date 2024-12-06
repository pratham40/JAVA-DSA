package Array.TwoD;

import java.util.Scanner;

public class RectangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements of matrices");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value of l1,l2,r1,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2  = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(solve(matrix,l1,l2,r1,r2));
        System.out.println(findSum2(matrix,l1,l2,r1,r2));
        System.out.println(findSum3(matrix,l1,l2,r1,r2));
    }

    private static int findSum3(int[][] matrix, int l1, int l2, int r1, int r2) {
        int ans=0;
        int sum=0;
        int up=0;
        int left=0;
        int upLeft=0;
        findPrefixSumMatrix(matrix);
        sum=matrix[l2][r2];
        left=matrix[l2][r1-1];
        up=matrix[l1-1][r2];
        upLeft=matrix[l1-1][r1-1];
        ans=sum-left-up+upLeft;
        return ans;
    }

    private static int findSum2(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum=0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
           if (r1>=1){
               sum+=matrix[i][r2]-matrix[i][r1-1];
           }else {
               sum+=matrix[i][r2];
           }
        }
        return sum;
    }

    private static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
//      row sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j]+= matrix[i][j-1];
            }
        }
//        Column sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }

    private static int solve(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum=0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}
