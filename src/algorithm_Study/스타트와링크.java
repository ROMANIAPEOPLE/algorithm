package algorithm_Study;

import java.util.Scanner;

public class 스타트와링크 {

	public static int[][] map; // 선수들의 능력치를 입력할 2차원 배열
	public static boolean[] team; // start 팀과 link 팀을 각각 true와 false로 나눔
	public static int n;
	public static int min = Integer.MAX_VALUE;

	
	public static void teamSelect() {
		int team_Start = 0;
		int team_Link = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) continue; //제외 가능
				if(team[i] && team[j]) team_Start+= map[i][j]; 
				//true 일 때를 Start 팀이라고 간주하고,
				if(!team[i] && !team[j]) team_Link+= map[i][j];
				//false 일 때를 Link 팀이라고 간주한다.
			}
		}
		
		min = Math.min(min, Math.abs(team_Link-team_Start));
	}
	
	public static void backTracking(int index, int count) {
		if (count == n / 2) { // 팀을 나눌 수 있는 조건이 된다면
			teamSelect(); // 팀을 나눠준다.
			return;
		}
		
		

		for(int i=index; i<n; i++) {
			team[i] = true;
			backTracking(i+1, count+1);
			team[i] = false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		team = new boolean[n];
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		backTracking(0, 0);
		System.out.println(min);

	}

}
