package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=(arr[1]-arr[0])+(arr[2]-arr[1]);
        System.out.print(sum);
    }
}
