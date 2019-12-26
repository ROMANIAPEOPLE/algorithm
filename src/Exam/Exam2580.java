package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam2580 {

	
	
	static int map[][] = new int[9][9];
	static ArrayList<int[]> list = new ArrayList<>();
	
	
	static void dfs(ArrayList<int[]> list, int index) {
		
		if(index == list.size()) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			System.exit(0);
		}
	
		for(int i=1; i<=9; i++) {
			if(row(list,index,i) && col(list,index,i) && subBind(list,index,i)) {
				map[list.get(index)[0]][list.get(index)[1]] = i;
				dfs(list,index+1);
			}
			
			if(i==9) {
				map[list.get(index)[0]][list.get(index)[1]] =0;
			}
			
		}
		
		
	}
	
	
	
	
	static boolean row(ArrayList<int[]> list, int index, int n) {
		for(int i=0; i<9; i++) {
			if(list.get(index)[1]==i) continue;
			
			if(map[list.get(index)[0]][i] == n) return false;
		}
		return true;
	}
	static boolean col(ArrayList<int[]> list, int index, int n) {
		for(int i=0; i<9; i++) {
			if(list.get(index)[0]==i) continue;
			
			if(map[i][list.get(index)[1]] == n) return false;
		}
		return true;
	}
	
	static boolean subBind(ArrayList<int[]> list, int index, int n) {
		int x = list.get(index)[0] /3;
		int y = list.get(index)[1] /3;
		x *=3;
		y *=3; 
		//시작 위치
		
		for(int i=x; i<x+3; i++) {
			for(int j=y; j<y+3; j++) {
				if(i == list.get(index)[0] && j == list.get(index)[1]) continue;
				if(map[i][j] !=0 && map[i][j] ==n ) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(map[i][j]==0) {
					list.add(new int[] {i,j});
				}
			}
		}
		
		
		dfs(list,0);

		
		
	}

}
