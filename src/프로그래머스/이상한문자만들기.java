package ���α׷��ӽ�;

import java.util.*;

public class �̻��ѹ��ڸ���� {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}

	public static String solution(String s) {
		String answer = "";
		String [] str = s.split("");

		int count =0;
		
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(" ")) {
				count=0;
				answer+=str[i];
			}
			
			else if(count%2 == 0) {
				answer+=str[i].toUpperCase();
				count++;
			}
			else {
				answer+=str[i].toLowerCase();
				count++;
			}
			
			
			
			
		}

		return answer;
	}
}
