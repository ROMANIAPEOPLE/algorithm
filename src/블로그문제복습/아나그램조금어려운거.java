package ��α׹�������;

import java.util.ArrayList;

//BACDGABCDA
//ABCD
public class �Ƴ��׷����ݾ����� {
	public static void main(String[] args) {
		String txt = "BACDGABCDA";
		String pat = "ABCD";

		ArrayList<Integer> res = new ArrayList<>();

		int[] patArr = new int[256];

		for (int i = 0; i < pat.length(); i++) {
			patArr[pat.charAt(i)]++;
		}

		for (int i = 0; i < txt.length() - pat.length() + 1; i++) {
			int[] txtArr = new int[256];
			for (int j = 0; j < pat.length(); j++) {
				txtArr[txt.charAt(i + j)]++;
			}

			if (check(patArr, txtArr)) {
				res.add(i);
			}
		}
		System.out.println(res.toString());
	}
	
	

	public static boolean check(int[] patArr, int[] txtArr) {
		for (int i = 0; i < patArr.length; i++) {
			if (patArr[i] != txtArr[i]) {
				return false;
			}
		}
		return true;
	}
}
