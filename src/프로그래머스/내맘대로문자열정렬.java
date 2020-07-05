package 프로그래머스;

import java.util.Arrays;
import java.util.Comparator;

public class 내맘대로문자열정렬 {
	
	public static void main(String[] args) {
		String [] arr = {"abce", "abcd", "cdx"};
		
		System.out.println(Arrays.toString(solution(arr,2)));
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				}
				
				return o1.charAt(n) - o2.charAt(n);
			}
			
		});
		
		answer = strings;
		
		return answer;
	}
}
