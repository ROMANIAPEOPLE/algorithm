package algorithm_Study;

import java.util.Scanner;

public class ��ŸƮ�͸�ũ {

	public static int[][] map; // �������� �ɷ�ġ�� �Է��� 2���� �迭
	public static boolean[] team; // start ���� link ���� ���� true�� false�� ����
	public static int n;
	public static int min = Integer.MAX_VALUE;

	
	public static void teamSelect() {
		int team_Start = 0;
		int team_Link = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) continue; //���� ����
				if(team[i] && team[j]) team_Start+= map[i][j]; 
				//true �� ���� Start ���̶�� �����ϰ�,
				if(!team[i] && !team[j]) team_Link+= map[i][j];
				//false �� ���� Link ���̶�� �����Ѵ�.
			}
		}
		
		min = Math.min(min, Math.abs(team_Link-team_Start));
	}
	
	public static void backTracking(int index, int count) {
		if (count == n / 2) { // ���� ���� �� �ִ� ������ �ȴٸ�
			teamSelect(); // ���� �����ش�.
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
