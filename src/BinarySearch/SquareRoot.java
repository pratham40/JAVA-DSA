package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SquareRoot {
    static int squareRoot(int no) {
        int start = 0;
        int end = no;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int square = mid * mid;
            if (square == no) {
                return mid;
            } else if (square > no) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int no = 25;
        System.out.printf("square root of %d is %d \n", no, squareRoot(no));
        System.out.println((int) Math.sqrt(no));
    }
}
