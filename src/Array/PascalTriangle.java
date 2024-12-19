package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        generate(5);
    }
    private static void generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        for (int i = 1; i < n; i++) {
            List<Integer> prevRow = ans.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            ans.add(currRow);
        }
        System.out.println(Arrays.toString(ans.toArray()));

    }
}
