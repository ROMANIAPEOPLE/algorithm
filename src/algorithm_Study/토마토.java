package algorithm_Study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ≈‰∏∂≈‰ {

	static int[][] tomato;
	static int n;
	static int m;
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static int ans;

	static void bfs(int x, int y) {
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] {x,y});
		
		while(!qu.isEmpty()) {
			x=qu.peek()[0];
			y=qu.peek()[1];
			qu.poll();
			for(int i=0; i<4; i++) {
				int curX = x+dx[i];
				int curY = y+dy[i];
				
				if(curX>=0 && curY>=0 && curX<n && curY<m) {
					tomato[curX][curY] = tomato[x][y] +1;
					ans = tomato[curX][curY];
					qu.add(new int[] {curX,curY});
					
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		tomato = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				tomato[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(tomato[i][j] == 1) {
					bfs(i,j);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(tomato[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(ans);
		

	}
}
