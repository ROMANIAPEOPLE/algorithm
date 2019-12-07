package algorithm_Study;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 단지번호 {

	static int n;
	static boolean[][] visit;
	static int[][] danji;
	static PriorityQueue<Integer> queue;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static void BFS(int x, int y) {
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] { x, y });

		// 단지의 시작마다 BFS가 새로 실행된다.

		int count = 0;
		while (!qu.isEmpty()) {
			x = qu.peek()[0];
			y = qu.peek()[1];
			qu.poll();
			for (int i = 0; i < 4; i++) {
				int curX = x + dx[i];
				int curY = y + dy[i];

				if (curX < 0 || curY < 0 || curX >= n || curY >= n)
					continue;
				if (visit[curX][curY])
					continue;
				if (danji[curX][curY] == 0)
					continue;

				visit[curX][curY] = true;
				qu.add(new int[] { curX, curY });
				count++;

			}
		}
		
		queue.add(count);

	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		danji = new int[n][n];
		visit = new boolean[n][n];
		
		queue= new PriorityQueue<Integer>();
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			for(int j=0; j<n; j++) {
				danji[i][j] = str.charAt(j) - '0';
			}
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(danji[i][j] == 1 && visit[i][j] == false) {
					BFS(i,j);
				}
			}
		}
		
		System.out.println(queue.size());
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}
}
