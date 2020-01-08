package 수학1;

import java.util.Arrays;
import java.util.Scanner;

public class 골드바흐 {
	
	static boolean [] check = new boolean[10001];

	
	
	public static void build_Prime() {
		for(int i=2; i<=10000; i++) {
			if(check[i]) {
				for(int j=i*2; j<=10000; j+=i) {
					check[j] = false;   // 소수면 true, 아니면 false
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0) {
			Arrays.fill(check, true);
			build_Prime();
			int n = sc.nextInt();
			
			for(int i=2; i<=n/2; i++) {
				if(check[i] && check[n-i]) {
					
					System.out.print((i) + " " + (n-i));
					System.out.println();
					break;
				}
			}
			
		}
		
	}
}
