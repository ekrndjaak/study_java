package BAEKJOON;

import java.util.*;

class Meeting {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class m1931 {
    public static int maxMeetingCount(Meeting[] meetings) {
        // 회의를 끝나는 시간을 기준으로 오름차순 정렬
        Arrays.sort(meetings, Comparator.comparingInt(a -> a.end));

        int count = 0;
        int endTime = 0;

        // 다음 회의가 현재 회의가 끝나는 시간보다 이후에 시작하면 회의를 추가
        for (int i = 0; i < meetings.length; i++) {
            if (meetings[i].start >= endTime) {
                // 시작 시간과 끝 시간이 같은 경우를 고려하여 처리
                if (meetings[i].start == meetings[i].end) {
                    continue;
                }
                count++;
                endTime = meetings[i].end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            meetings[i] = new Meeting(start, end);
        }

        int maxMeetingCount = maxMeetingCount(meetings);
        System.out.println(maxMeetingCount);

    }
}
