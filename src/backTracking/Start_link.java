package backTracking;

import java.util.Scanner;

public class Start_link {

	static int n;
	static int [][] map;
	static boolean [] team;
	static int min =Integer.MAX_VALUE;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		map= new int[n][n];
		team = new boolean[n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		backTrack(0,0);
		System.out.println(min);
	}
	public static void backTrack(int index, int depth) {
		if(depth == n/2) {
			team_div();
			return;
		}
		for(int i=index; i<n; i++) {
			team[i] = true;
			backTrack(i+1, depth+1);
			team[i] = false;
		}
	}
	public static void team_div() {
		int teamStart=0;
		int teamLink=0;
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				if(team[i] && team[j]) teamStart+= map[i][j];
				if(!team[i] && !team[j]) teamLink+=map[i][j];
			}
		}
		
		
		min = Math.min(min, Math.abs(teamStart-teamLink));
		
		
		
		
	}
	
}
