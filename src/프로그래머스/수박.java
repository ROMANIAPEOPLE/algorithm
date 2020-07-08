package 프로그래머스;

public class 수박 {
	public static void main(String[] args) {

		System.out.println(solution(7));

	}

	public static String solution(int n) {
		String answer = "";

		StringBuilder bd = new StringBuilder(answer);
		String str = "수박";

		if (n % 2 == 0) {
			n = n / 2;
			for (int i = 0; i < n; i++) {
				bd.append(str);
			}
		} else {
			n = (n / 2) + 1;
			for (int i = 0; i < n; i++) {
				bd.append(str);

			}
			bd.delete(bd.length() - 1, bd.length());
		}
		answer = bd.toString();
		return answer;
	}

	public String solution2(int n) {
		String result = "";
		for (int i = 0; i < n; i++)
			result += i % 2 == 0 ? "수" : "박";
		return result;
	}
}
