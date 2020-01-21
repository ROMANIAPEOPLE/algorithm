package 코딩테스트_BASIC;

import java.util.Arrays;
import java.util.Random;

public class Q4 {

	static void solution(int[] a) {
		int index = 0;
		for(int i=0; i<a.length; i++) {
			if((a[i] % 2 !=0 ) && (a[i] % 3 != 0)) {
				a[index++] =  a[i];
			}
		}
		for(int i = index; i<a.length; i++) {
			a[i]  = -1;
		}

	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[30];
		for (int i = 0; i < 30; ++i)
			a[i] = random.nextInt(8) + 1;
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
//[8, 3, 8, 4, 4, 6, 4, 4, 7, 8, 1, 5, 3, 5, 2, 1, 4, 2, 6, 2, 1, 1, 4, 1, 2, 1, 2, 8, 7, 3]
//[7, 1, 5, 5, 1, 1, 1, 1, 1, 7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]
