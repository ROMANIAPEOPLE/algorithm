package 블로그문제복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Exam1987 {
	
	static int R,C;
	static int [][] map;
	static boolean [] ck = new boolean[26];
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static int ans = Integer.MIN_VALUE;
	
	
	static void dfs(int x, int y , int count) {
		if(ck[map[x][y]]) {
			ans = Math.max(ans, count);
			return;
		}
		else {
			ck[map[x][y]] = true;
			for(int i=0; i<4; i++) {
				int nx = dx[i] + x;
				int ny = dy[i] + y;
				
				if(nx >=0 && ny >=0 && nx<R && ny<C) {
					dfs(nx,ny,count+1);
				}
				
			}
			
			ck[map[x][y]] = false;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		map = new int[R][C];
		
		for(int i=0; i<R; i++) {
			String str = br.readLine();
			for(int j=0; j<C; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}
		dfs(0,0,0);
		System.out.println(ans);
	}

}
