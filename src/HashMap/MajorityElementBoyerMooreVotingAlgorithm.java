package HashMap;

import java.util.ArrayList;

public class MajorityElementBoyerMooreVotingAlgorithm {
    static boolean isMajority(int[] a, int size, int candidate) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == candidate) {
                count++;
            }
        }
        return count > size / 2;
    }

    public static void main(String[] args) {
        int[] a = {3, 1,2,3,3};
        int candidate = -1;
        int votes = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (votes == 0) {
                candidate = a[i];
                votes = 1;
            } else if (a[i] == candidate) {
                votes++;
            } else {
                votes--;
            }

        }
        System.out.println(isMajority(a, a.length, candidate)?candidate:-1);
    }
}
