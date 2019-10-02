package algorithm_Study;

public class 소수판별 {

	static int 에라토스(int n) { // n이하의 자연수 중에서 소수를 찾기.
		boolean[] check = new boolean[n + 1];
		int[] prime = new int[n];
		int pn = 0;
		int count = 0;
		// 0과 1은 소수가 아니기때문에 2부터 초기화해준다.

		for (int i = 2; i < n; i++) {
			if (check[i] == false) {
				prime[pn++] = i;
			}

			for (int j = i + i; j <= n; j += i) {
				check[j] = true;
			}
		}

		for (int i = 0; i < prime.length; i++) {
			if (prime[i] != 0) {
				count++;
			}
		}

		return count;
	}

	static boolean 소수검사(int n) {
		int cnt = 1;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		
		if(cnt ==2) return true;
		else return false;
		
	}

	public static void main(String[] args) {

		System.out.println(에라토스(100));
		System.out.println(소수검사(97));
		
	}

}
