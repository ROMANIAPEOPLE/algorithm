package inflearn_codingTest.StringAndArray;

import java.util.Arrays;
import java.util.Scanner;

class Intervals implements Comparable<Intervals> {
	int start;
	int end;

	Intervals() {
		start = 0;
		end = 0;
	}

	Intervals(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Intervals o1) {
		// TODO Auto-generated method stub
		int r = this.end - o1.end;
		if (r == 0) {
			r = this.start - o1.start;
		}
		return r;
	}

}

public class MeetingRoom_backjoon {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		Intervals[] in = new Intervals[testCase];

		for (int i = 0; i < testCase; i++) {
			in[i] = new Intervals(sc.nextInt(), sc.nextInt());
		}

		solve(in);

	}

	public static void solve(Intervals[] in) {
		int count = 1;
		Arrays.parallelSort(in);

		int end = in[0].end;
		for (int i = 1; i < in.length; i++) {
			if (in[i].start >= end) {
				count++;
				end = in[i].end;
			}
		}

		System.out.println(count);
	}

}
