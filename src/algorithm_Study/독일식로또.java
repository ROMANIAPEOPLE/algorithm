package algorithm_Study;

import java.util.Scanner;

public class ���Ͻķζ� {

	static int n;
	static int[] lotto;

	public static void dfs(int index, int count, String result) {
		if(index == n) {
			if(count == 6) {
				System.out.println(result);
				return;
			}
		}
		
		else {
			dfs(index+1, count+1, result+lotto[index]+" ");
			dfs(index+1, count, result);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			lotto = new int[n];
			
			for(int i=0; i<n; i++) {
				lotto[i] = sc.nextInt();
			}

			dfs(0,0,""); 
			System.out.println();
			//0��° �ε�������, �ζ� count �� 0 ����, ���� ����� ������ �� ���ڿ�
			
		}
	}

}
