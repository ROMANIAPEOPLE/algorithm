package 프로그래머스;

//https://programmers.co.kr/learn/courses/30/lessons/12903
public class 가운데글자가져오기 {
	public static void main(String[] args) {

		String s ="abcde";
		
		System.out.println(solution(s));
				
	}

	public static String solution(String s) {
		String answer = "";
		
		
		if(s.length() %2 == 1) {
			int n = s.length()/2;
			answer = String.valueOf(s.charAt(n));
		}
		else {
			int n = s.length()/2;
			answer = s.substring(n-1, n+1);
		}
		
		
		return answer;
	}

}
