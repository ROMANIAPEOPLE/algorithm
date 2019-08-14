package Exam;

import java.util.Arrays;
import java.util.Scanner;

class Score implements Comparable<Score> {

	public String name;
	public int k;
	public int e;
	public int m;

	public static final int DESC = -1;
	public static final int ASC = 1;

	public Score(String name, int k, int e, int m) {

		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;

	}

	@Override
	public int compareTo(Score s) {

		int r = (this.k - s.k) * DESC; // 국어점수 내림차순
		if (r == 0)
			r = this.e - s.e * ASC; // 영어점수 오른차순
		if (r == 0)
			r = (this.m - s.m) * DESC;// 수학점수 내림차순
		if (r == 0)
			r = this.name.compareTo(s.name); //이름순서

		return r;
	}

}

public class Exam10825 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		Score[] s = new Score[testCase];

		for (int i = 0; i < testCase; i++) {
			String name = sc.next();
			int k = sc.nextInt(); // 국
			int e = sc.nextInt(); // 영
			int m = sc.nextInt(); // 수
			s[i] = new Score(name, k, e, m);
		}

		Arrays.sort(s);

		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].name);
		}

	}

}
