package CodeForces;

import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int steps=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==1){
                    steps=Math.abs(2-i)+Math.abs(2-j);
                    System.out.println(steps);
                    return;
                }
            }
        }
    }
}
