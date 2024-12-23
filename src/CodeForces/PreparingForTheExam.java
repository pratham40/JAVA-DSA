package CodeForces;

import java.util.*;

public class PreparingForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of questions
            int m = sc.nextInt(); // Number of lists
            int k = sc.nextInt(); // Number of known questions
            int[] missingQuestionInEachList = new int[m];
            HashSet<Integer> knownQuestion = new HashSet<>();

            for (int i = 0; i < m; i++) {
                missingQuestionInEachList[i] = sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                knownQuestion.add(sc.nextInt());
            }

            StringBuilder ans = new StringBuilder();

            if (n == k) {
                ans.append("1".repeat(m));
                System.out.println(ans);
            } else if (n - 1 > k) {
                ans.append("0".repeat(m));
                System.out.println(ans);
            } else {
                for (int i = 0; i < m; i++) {
                    if (knownQuestion.contains(missingQuestionInEachList[i])) {
                        ans.append('0');
                    } else {
                        ans.append('1');
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
