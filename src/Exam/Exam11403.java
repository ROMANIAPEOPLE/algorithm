package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam11403 {

	static int [][] map;
	static int n;
	static boolean [] visit;
	static int [][] result;
	
	static void bfs(int x) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(x);
		

		while(!qu.isEmpty()) {
			int cx = qu.poll();
			
			for(int i=0; i<n; i++) {
				if(map[cx][i] == 1 && !visit[i]) {
					visit[i] = true;
					result[x][i]  = 1;
					qu.add(i);
				}
					
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		map = new int[n][n];
		result = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		

		for(int i=0; i<n; i++) {
			visit= new boolean[n];
			bfs(i);
			
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}
}