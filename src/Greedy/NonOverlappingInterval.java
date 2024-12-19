package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NonOverlappingInterval {

    static class Interval{
        int startTime;
        int endTime;
        public Interval(int startTime,int endTime){
            this.startTime=startTime;
            this.endTime=endTime;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }

    public static class IntervalComparator implements Comparator<Interval>{
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.startTime-o2.startTime;
        }
    }

    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
        List<Interval> intervalList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            intervalList.add(new Interval(intervals[i][0],intervals[i][1]));
        }

        intervalList.sort(new IntervalComparator());
        System.out.println(intervalList);

        int cnt=1;
        Interval prevInterval=intervalList.get(0);
        for (int i = 1; i < intervalList.size(); i++) {
            Interval currentInterval = intervalList.get(i);
            if (currentInterval.startTime>=prevInterval.endTime){
                cnt++;
                prevInterval=currentInterval;
            }
        }
        System.out.println(intervalList.size()-cnt);
    }
}
