package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Exam2606_2 {
	static int [][] computer;
	static int com_cnt , conn_cnt;
	static boolean [] visit;
	static int count;
	
	
	static void bfs(int start) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(start);
		visit[start] = true;
		while(!qu.isEmpty()) {
			start = qu.poll();
			for(int i=1; i<=com_cnt; i++) {
				if(!visit[i] && computer[start][i] == 1) {
					visit[i] = true;
					count++;
					qu.add(i);
				}
			}
		}
		
	}
	
	
	static void dfs(int start) {
		visit[start] = true;
		for(int i=1; i<=com_cnt; i++) {
			if(!visit[i] && computer[start][i]==1) {
				visit[i] = true;
				count++;
				dfs(i);
			}
		}
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		com_cnt = Integer.parseInt(br.readLine());
		conn_cnt =Integer.parseInt(br.readLine());
		
		visit = new boolean[com_cnt+1];
		computer = new int[com_cnt+1][com_cnt+1];
		
		for(int i=0; i<conn_cnt; i++) {
			st=new StringTokenizer(br.readLine());
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			computer[p1][p2]=computer[p2][p1] =1;
		}
		
//		dfs(1);
		bfs(1);
		System.out.println(count);
		
	}

}
