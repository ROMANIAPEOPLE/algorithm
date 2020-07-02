package 프로그래머스;

public class year_2016 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;

		System.out.println(solution(a, b));
	}

	public static String solution(int a, int b) {
		String answer = "";

		for (int i = 1; i < a; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				b += 31;
			} else if (i == 2) {
				b += 29;
			} else {
				b += 30;
			}
		}

		switch (b % 7) {
		case 0:
			answer = "THU";
			break;
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;

		}
		return answer;
	}
}
