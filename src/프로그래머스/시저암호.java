package 프로그래머스;
public class 시저암호 {

	public static void main(String[] args) {
		String s = "a B z";
		System.out.println(solution(s, 4));
	}

	public static String solution(String s, int n) {
		String answer = "";

		char[] ans = new char[s.length()];

		char[] str = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			int ascii = (int) str[i];
			if (str[i] == ' ') {
				ans[i] = ' ';
				continue;
			}
			int w = n;
			while (w-- > 0) {
				ascii++;
				if (ascii == 123) {
					ascii = 97;
				}

				else if (ascii == 91) {
					ascii = 65;
				}
			}
			ans[i] = (char) ascii;
			w = n;
		}

		for (int i = 0; i < ans.length; i++) {
			answer += Character.toString(ans[i]);
		}

		return answer;
	}
}
