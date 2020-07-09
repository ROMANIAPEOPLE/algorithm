package 프로그래머스;

import java.util.Arrays;

public class 자연수뒤집어배열로 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

	public static int[] solution(long n) {
		
		
		String [] s = String.valueOf(n).split("");
		int[] answer = new int[s.length];
		int j =0;
		for(int i=s.length-1; i>=0; i--) {
			answer[j++] =  Integer.parseInt(s[i]);
		}
		
		return answer;
	}
}
