package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class LV1수포자 {

	public static void main(String[] args) {

		int[] answers = { 1,2,3,4,5 };
		System.out.println(Arrays.toString(solution(answers)));

	}

	public static int[] solution(int[] answers) {
		int[] answer = {};

		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int [] c = new int[3];
 		
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == one[i%one.length]) {
				c[0]++;
			}
			if(answers[i] == two[i%two.length]) {
				c[1]++;
			}
			if(answers[i] == three[i%three.length]) {
				c[2]++;
			}
		}

		int max = c[0];
		max =  Math.max(max, c[1]);
		max = Math.max(max, c[2]);
		
		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0; i<c.length; i++) {
			if(max == c[i]) {
				list.add(i);
			}
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i)+1;
		}
		Arrays.parallelSort(answer);
		
		

		return answer;
	}
}
