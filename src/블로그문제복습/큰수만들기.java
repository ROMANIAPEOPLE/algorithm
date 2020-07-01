package 블로그문제복습;

import java.util.Arrays;
import java.util.Comparator;

public class 큰수만들기 {
	public String solution(int[] numbers) {
		String [] str = new String[numbers.length];
		String st="";
		for(int i=0; i<numbers.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		
		
		Arrays.sort(str,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(0) == o2.charAt(0)) {
					int a = Integer.parseInt(o1+o2);
					int b = Integer.parseInt(o2+o1);
					return b-a;
				}
				return o2.charAt(0) - o1.charAt(0);
			}
		});
		
		for(String s : str) {
			st+=s;
		}
	
		return st;
	}
}