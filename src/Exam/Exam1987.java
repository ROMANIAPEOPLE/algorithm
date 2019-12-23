package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam1987 {

	static int R,C;
	static int [][] map;
	static boolean [] visit = new boolean[26];
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	
	static int result = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		
		map= new int[R][C];
		
		for(int i=0; i<map.length; i++) {
			String str = br.readLine();
			for(int j=0; j<map.length; j++) {
				map[i][j] = str.charAt(j) -'A';
				
			}
		}
		dfs(0,0,0);
		System.out.println(result);
	}
	public static void dfs(int x, int y, int count) {
		if(visit[map[x][y]]) {
			result = Math.max(result, count);
		}
		else {
			visit[map[x][y]] = true;
			for(int i = 0; i<4; i++) {
				int curX = x+dx[i];
				int curY = y+dy[i];
				
				if(curX>=0 && curY>=0 && curX<R & curY<C) {
					dfs(curX,curY,count+1);
				}
			}
			
			visit[map[x][y]] = false;
		}
	}

}
