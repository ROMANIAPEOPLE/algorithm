package 블로그문제복습;

import java.util.Arrays;

//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
public class 가장큰수 {
	public int[] solution(int[] array, int[][] commands) {
		
		int [] result = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			int [] temp = {};
			temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			
			Arrays.parallelSort(temp);
			
			result[i] = temp[commands[i][2]-1];
		}
		return result;
	}
}
