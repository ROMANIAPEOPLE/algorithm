package algorithm_Study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ¹Ì·ÎÅ½»ö {

	static int[][] result;
	static int[][] miro;
	static int n;
	static int m;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	
	public static void bfs(int x, int y) {
		result[0][0] = 1;
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] {x,y});
		
		while(!qu.isEmpty()) {
			x = qu.peek()[0];
			y = qu.peek()[1];
			qu.poll();
			for(int i=0; i<4; i++) {
				int cx = x+dx[i];
				int cy = y+dy[i];
				if(cx>=0 && cy>=0 && cx<n && cy<m) {
					if(miro[cx][cy] == 1) {
						miro[cx][cy] = 2;
						result[cx][cy] = result[x][y]+1;
						qu.add(new int[] {cx,cy});
					}
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		miro = new int[n][m];
		result = new int[n][m];
		for(int i=0; i<n; i++) {
			String str = sc.next();
			for(int j=0; j<m; j++) {
				miro[i][j]=str.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(miro[i][j] == 1) {
					miro[i][j] =2;
					bfs(i,j);
				}
			}
		}
		System.out.println(result[n-1][m-1]);
	}
}