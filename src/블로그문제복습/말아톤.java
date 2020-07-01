package 블로그문제복습;

import java.util.Arrays;

public class 말아톤 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(participant);
		int i;
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[i];
	}
}
