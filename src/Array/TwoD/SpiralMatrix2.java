package Array.TwoD;

public class SpiralMatrix2 {
    static int[][] generateSpiralOrder(int n){
        int[][] matrix = new int[n][n];
        int topRow=0;
        int bottomRow=n-1;
        int leftCol=0;
        int rightCol=n-1;
        int currnum=1;
        while (currnum<=n*n){
            // top row -> left col to right col
            for (int j = leftCol; j <=rightCol && currnum<n*n ; j++) {
                matrix[topRow][j]=currnum;
                currnum++;
            }
            topRow++;
            // right col -> topRow to bottom row
            for (int i = topRow; i <=bottomRow && currnum<n*n; i++) {
                matrix[i][rightCol]=currnum;
                currnum++;
            }

            rightCol--;
            // bottom row -> right col to left col
            for (int j = rightCol; j >= leftCol && currnum<n*n; j--) {
                matrix[bottomRow][j]=currnum;
                currnum++;
            }
            bottomRow--;
            // left Col -> bottom row to top row
            for (int i = bottomRow; i >=topRow && currnum<n*n; i--) {
                matrix[i][leftCol]=currnum;
                currnum++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix=generateSpiralOrder(3);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
