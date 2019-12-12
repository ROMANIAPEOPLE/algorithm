package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam1697_BFS {

	static int subin;
	static int bro;
	static int [] visit = new int[100001];
	
	static void bfs() {
		
		Queue<Integer> qu = new LinkedList<Integer>();
		visit[subin] = 1;
		qu.add(subin);
		
		while(!qu.isEmpty()) {
			subin = qu.poll();
			
			if(subin == bro) break;
			
			if(subin+1 <=100000 && visit[subin+1] ==0) {
				qu.add(subin+1);
				visit[subin+1] = visit[subin]+1;
			}
			if(subin-1 >= 0 && visit[subin-1] ==0) {
				qu.add(subin-1);
				visit[subin-1] = visit[subin]+1;
			}
			if(2*subin <= 100000 && visit[2*subin] ==0) {
				qu.add(2*subin);
				visit[2*subin] = visit[subin]+1;
			}
			
			
		}
	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		subin=sc.nextInt();
		bro=sc.nextInt();
		
		bfs();
		
		System.out.println(visit[bro]-1);
		

	}

}
