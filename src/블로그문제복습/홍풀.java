package ��α׹�������;

import java.util.Arrays;
//�̰� Ʋ����?
public class ȫǮ {
	
	public static void main(String[] args) {
		Interval in3 = new Interval(0, 30);
		Interval in1 = new Interval(5, 32);
		Interval in2 = new Interval(31, 40);
		Interval in4 = new Interval(41, 50);
		Interval in5 = new Interval(51, 65);
		Interval in6 = new Interval(63, 67);

		Interval[] intervals = { in1, in2, in3, in4, in5,in6 };
		
		System.out.println(solution(intervals));
	}
	
	public static int solution(Interval[] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1.start - o2.start);
        int size = intervals.length;
        int answer = 1;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (intervals[i].end >= intervals[j].start) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
