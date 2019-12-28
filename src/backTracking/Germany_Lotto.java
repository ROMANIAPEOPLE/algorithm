package backTracking;

import java.util.Scanner;

public class Germany_Lotto {

	static int k;
	static int[] Lotto;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			k = sc.nextInt();

			if (k == 0)
				break;

			Lotto = new int[k];
			for (int i = 0; i < k; i++) {
				Lotto[i] = sc.nextInt();
			}
			backTrack(0, 0, "");
			System.out.println();
		}

	}

	public static void backTrack(int index, int count, String str) {
		if (index == k) {
			if (count == 6) {
				System.out.println(str);
				return;
			}
		} else {
			backTrack(index + 1, count + 1, str + Lotto[index] + " ");
			backTrack(index + 1, count, str);
		}

	}

}
