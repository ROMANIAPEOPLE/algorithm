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

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {

				if (board[j][moves[i] - 1] != 0) {
					if (!st.empty()) { // 스택이 비어있을때
						if (st.peek() == board[j][moves[i] - 1]) { // 피크값과 현재값이 동일하다면 터진다.
							res += 2;
							st.pop();
							

						} else { // 동일하지 않다면 그냥 넣어만 준다.
							st.push(board[j][moves[i] - 1]);
							
						}
					} else {// 스택이 비어있다면
						st.push(board[j][moves[i] - 1]);
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		return res;
	}
}