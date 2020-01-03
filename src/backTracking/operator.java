package backTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class operator {
	static int n;
	static char[] operator = { '+', '-', '*', '/' };
	static ArrayList<Character> list = new ArrayList<>();
	static boolean[] visit;
	static int[] map;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;

	public static void dfs(String s) {
		
		if(s.length() == n-1) {
			int index = 1;
			int result = map[0];
			
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == '+') {
					result +=map[index++];
				}
				else if(s.charAt(i) == '-') {
					result -=map[index++];
				}
				else if(s.charAt(i) == '*') {
					result *=map[index++];
					
				}
				else if(s.charAt(i) == '/') {
					result /=map[index++];
				}
			}
			min = Math.min(min,result);
			max = Math.max(max, result);
		}

		for(int i=0; i<list.size(); i++) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(s+list.get(i));
				visit[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n];
		visit = new boolean[n - 1]; // 연산자의 개수만큼
		for (int i = 0; i < n; i++) {
			map[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				list.add(operator[i]);
			}
		}
		dfs("");
		
		System.out.println(max);
		System.out.println(min);
		
	}
}