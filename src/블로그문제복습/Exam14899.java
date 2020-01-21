package ��α׹�������;

import java.util.Scanner;

public class Exam14899 {

	public static int n; // �Է¹��� n
	public static int [][] map; //�ɷ�ġ�� ������ 2���� �迭
	public static boolean [] team; // ���� ���� boolean �迭
	public static int min = Integer.MAX_VALUE;
	
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
		
		bt(0,0);
		
		System.out.println(min);
		
	}
	
	public static void selectTeam() {
		
		int team_Start = 0;
		int team_Link = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				if(team[i] && team[j]) team_Start += map[i][j];
				if(!team[i] && !team[j]) team_Link +=map[i][j];
			}
		}
		
		min = Math.min(min, Math.abs((team_Start)-(team_Link)));
			
	}
	public static void bt(int index, int count) {
		if(count == n/2) {
			selectTeam();
			return;
		}
		
		for(int i=index; i<n; i++) {
			team[i] = true;
			bt(i+1,count+1);
			team[i] = false;
		}
		
	}
	
}