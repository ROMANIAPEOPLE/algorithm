package Exam;

import java.util.Scanner;

public class Exam2606_3 {

	
	
	static int [][] computer;
	static int n,m;
	static boolean [] visit;
	static int count;
	
	public static void dfs(int x) {
		visit[x] = true;
		for(int i=1; i<=n; i++) {
			if(!visit[i] && computer[x][i] == 1 ) {
				count++;
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		
		computer = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			computer[p1][p2] = computer[p2][p1]  = 1;
		}
		dfs(1);
		
		System.out.println(count);
		
		
		
	}
}
