package BinarySearch;

public class RaceTrack {

    static boolean isPossible(int[] raceTrack, int noOfStudent, int maxDistance) {
        int placedStudent = 1;
        int lastKid = raceTrack[0];
        for (int i = 1; i < raceTrack.length; i++) {
            if (raceTrack[i] - lastKid >= maxDistance) {
                placedStudent++;
                lastKid = raceTrack[i];
            }
        }
        return placedStudent >= noOfStudent;
    }

    static int raceTrack(int[] raceTrack, int noOfStudent) {
        if (noOfStudent > raceTrack.length) {
            return -1;
        }
        int start = 0;
        int end = (int) 1e9;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(raceTrack, noOfStudent, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 9};
        int m = 3;
        System.out.println(raceTrack(a, m));
    }
}
