package algorithm_Study;

public class �Ҽ��Ǻ� {

	static int �����佺(int n) { // n������ �ڿ��� �߿��� �Ҽ��� ã��.
		boolean[] check = new boolean[n + 1];
		int[] prime = new int[n];
		int pn = 0;
		int count = 0;
		// 0�� 1�� �Ҽ��� �ƴϱ⶧���� 2���� �ʱ�ȭ���ش�.

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

	static boolean �Ҽ��˻�(int n) {
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

		System.out.println(�����佺(100));
		System.out.println(�Ҽ��˻�(97));
		
	}

}
