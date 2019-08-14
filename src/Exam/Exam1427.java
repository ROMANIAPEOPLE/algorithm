package Exam;

import java.util.Scanner;

public class Exam1427 {
//소트인사이드
	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	static void bSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) { // 버블정렬을 내림차순으로
					swap(a, j, j + 1);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String[] temp = new String[num.length()]; // 숫자를 String형으로 저장할 배열

		int[] result = new int[temp.length]; // 결과를 출력할 배열

		for (int i = 0; i < num.length(); i++) {
			temp[i] = num.substring(i, i + 1); // String형 문자를 하나씩 배열에 저장
		}

		for (int i = 0; i < temp.length; i++) {
			result[i] = Integer.parseInt(temp[i]);
			// String을 int형으로 바꿔주는 메소드 Integer.parseInt 사용
		}

		bSort(result);

		for (int a : result) {
			System.out.printf("%d", a);
		}

	}

}
