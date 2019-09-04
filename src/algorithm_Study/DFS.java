package algorithm_Study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS {

	static int E; // 간선
	static int V; // 정검
	static int[][] ad; // 인접행렬
	static boolean[] visit;

	public static void dfs(int i) {
		visit[i] = true;
		System.out.print(i + " ");

		for (int j = 0; j < V + 1; j++) {
			if (ad[i][j] == 1 && visit[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int i) {
		Queue<Integer> q = new <Integer>LinkedList();

		q.offer(i);
		visit[i] = true;

		while (!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp + " ");

			for (int j = 1; j <= V; j++) {
				if (ad[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true; // 큐에 넣을 노드들을 잠재적으로 방문한다는 가정하에 입력

				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		int start = sc.nextInt();
		ad = new int[V + 1][V + 1];
		visit = new boolean[V + 1];

		for (int i = 0; i < E; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();

			ad[t1][t2] = ad[t2][t1] = 1;

			// 그래프 제작 단계
		}

		dfs(start);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(start);
	}

}
