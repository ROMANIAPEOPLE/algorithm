package programmers.hash;

import java.util.Arrays;

public class 완주하지못한선수 {

	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}

		}
		return participant[i];
	}
}
