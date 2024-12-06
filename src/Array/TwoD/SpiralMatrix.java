package Array.TwoD;

public class SpiralMatrix {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow=0;
        int bottomRow=r-1;
        int leftCol=0;
        int rightCol=c-1;
        int totalElement=0;
        while (totalElement<r*c){
            // top row -> left col to right col
            for (int j = leftCol; j <=rightCol && totalElement<r*c ; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;
            // right col -> topRow to bottom row
            for (int i = topRow; i <=bottomRow && totalElement<r*c; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElement++;
            }

            rightCol--;
            // bottom row -> right col to left col
            for (int j = rightCol; j >= leftCol && totalElement<r*c; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            // left Col -> bottom row to top row
            for (int i = bottomRow; i >=topRow && totalElement<r*c; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;


        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSpiralOrder(matrix,3,3);
    }
}
