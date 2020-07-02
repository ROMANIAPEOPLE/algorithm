package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12906
public class 같은숫자는싫어 {
	
	public static void main(String[] args) {
		int [] arr = {4,4,4,3,3};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
		//비교해서 앞에꺼 넣어주기
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length-1]);
		
		answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		
		return answer;

	
	}
}