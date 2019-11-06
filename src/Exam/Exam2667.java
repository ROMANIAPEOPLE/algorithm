package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exam2667 {

	public static int n;
	public static int [][] danji = new int[n][n];
	public static boolean visit [][] = new boolean[n][n];
	 
	public static PriorityQueue<Integer> queue;
	
	
	public static void BFS(int y, int x) {
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.offer(new int[] {y,x});
		
		int count =0;
		while(!qu.isEmpty()) {
			int currY = qu.peek()[0];
			int currX = qu.peek()[1];
			qu.poll();
			
			if(currY <0 || currX <0 || currY >=n || currX >=n) continue;
			if(visit[currY][currX]) continue;
			if(danji[currY][currX] ==0) continue;
			
			count+=1;
			visit[currY][currX]= true;
			qu.offer(new int[] {currY+1,currX});
			qu.offer(new int[] {currY-1,currX});
			qu.offer(new int[] {currY,currX+1});
			qu.offer(new int[] {currY,currX-1});
	
			
		}
		
		queue.offer(count);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		
		danji = new int [n][n];
		visit = new boolean [n][n];
		
		queue = new PriorityQueue<Integer>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				danji[i][j]=Integer.parseInt(str.substring(j, j+1));  //단지 생성
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visit[i][j] && danji[i][j]==1) {
					BFS(i,j);
				}
			}
		}
		
		
		
		System.out.println(queue.size());
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		
		
		
	}

}
