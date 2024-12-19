package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMeetingInRoom {
//    Activity Selection Problem
    static class Meeting {
        int startTime;
        int endTime;
        int meetingNo;
        public Meeting(int startTime, int endTime, int meetingNo) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.meetingNo = meetingNo;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }

        static class MeetingComparator implements Comparator<Meeting> {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.endTime - m2.endTime;
            }
        }

    }
    public static void main(String[] args) {
        List<Integer> startTime=List.of(1,3,2,5);
        List<Integer> endTime=List.of(2,4,3,6);
        List<Meeting> meetings=new ArrayList<>();
        for (int i = 0; i < startTime.size(); i++) {
            meetings.add(new Meeting(startTime.get(i),endTime.get(i),i+1));
        }
        meetings.sort(new Meeting.MeetingComparator());
        System.out.println(meetings);

        List<Integer> ans = new ArrayList<>();
        ans.add(meetings.get(0).meetingNo);
        Meeting prevMeeting=meetings.get(0);
        int maxMeeting=1;
        for (int i = 1; i < meetings.size(); i++) {
            Meeting currentMeeting=meetings.get(i);
            if (currentMeeting.startTime>prevMeeting.endTime){
                ans.add(currentMeeting.meetingNo);
                prevMeeting=currentMeeting;
                maxMeeting++;
            }
        }
        System.out.println(ans);
        System.out.println(maxMeeting);

    }
}
