/*
문제 : 다음 숫자 카드를 한 번씩만 사용하여 두 수의 차가 가장 작도록 네 자리 수를 만들어
          두 수의 차를 구하시오.(단,두 네 자리수를 구성하는 숫자들은 모두 달라야 합니다)
          카드 :  0,1,2,3,4,5,6,7,8,9,10
*/
package 코딩테스트_BASIC;

import java.util.Arrays;
import java.util.Random;

public class QuizTest2 {

	public static void main(String[] args) {
		Random ran = new Random();
		int ranNum;
		int[] pickNum1 = new int[4];
		int[] pickNum2 = new int[4];
		boolean[] check = new boolean[11];
		for (int i = 0; i < pickNum1.length; i++) {
			do {
				ranNum = ran.nextInt(11);
			} while (check[ranNum]);
			check[ranNum] = true;
			pickNum1[i] = ranNum;
		}
		Arrays.fill(check, false);

		for (int i = 0; i < pickNum2.length; i++) {
			do {
				ranNum = ran.nextInt(11);
			} while (check[ranNum]);
			check[ranNum] = true;
			pickNum2[i] = ranNum;

		}
		
		System.out.println(Arrays.toString(pickNum1));
		System.out.println(Arrays.toString(pickNum2));
	}
}