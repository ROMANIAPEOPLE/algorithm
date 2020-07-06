package 프로그래머스;

import java.util.Arrays;

public class 문자열내림차순 {

	public static void main(String[] args) {

		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		
		String [] str = s.split("");
		
		Arrays.sort(str,(o1,o2) -> o2.compareTo(o1));

		for(String st : str) {
			answer+=st;
		}
		
		return answer;
	}
}
