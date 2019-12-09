package algorithm_Study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스_bfs_2606 {

	static int com_cnt, conn_cnt;
	static int[][] computer;
	static boolean[] check;
	static int count;

	static void bfs(int x) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(x);

		while (!qu.isEmpty()) {
			x = qu.poll();
			check[x] = true;
			for (int i = 1; i < com_cnt + 1; i++) {
				if (!check[i] && computer[x][i] == 1) {
					check[i] = true;
					qu.add(i);
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		com_cnt = sc.nextInt();
		conn_cnt = sc.nextInt();

		computer = new int[com_cnt + 1][com_cnt + 1];
		check = new boolean[com_cnt + 1];

		for (int i = 0; i < conn_cnt; i++) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			computer[a1][a2] = computer[a2][a1] = 1;
		}
		bfs(1);
		System.out.println(count);
	}
}