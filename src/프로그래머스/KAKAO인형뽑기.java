package 프로그래머스;

import java.util.Stack;

public class KAKAO인형뽑기 {
	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {

		int res = 0;
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<moves.length; i++) {
			
		}


		return res;
	}
}