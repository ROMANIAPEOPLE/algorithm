/*
���� : ���� ���� ī�带 �� ������ ����Ͽ� �� ���� ���� ���� �۵��� �� �ڸ� ���� �����
          �� ���� ���� ���Ͻÿ�.(��,�� �� �ڸ����� �����ϴ� ���ڵ��� ��� �޶�� �մϴ�)
          ī�� :  0,1,2,3,4,5,6,7,8,9,10
*/
package �ڵ��׽�Ʈ_BASIC;

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