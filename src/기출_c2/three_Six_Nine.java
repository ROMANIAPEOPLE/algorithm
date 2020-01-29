package ±‚√‚_c2;

public class three_Six_Nine {

	public static void main(String[] args) {

		int num = 100;

		for (int i = 1; i <= num; i++) {
			int count = calcul(i);

			if (count == 0) {
				System.out.print("");
				continue;
			}
			System.out.print(i + " ");

			for (int j = 0; j < count; j++) {
				System.out.print("¬¶");
			}
			System.out.println();
		}
	}
	public static int calcul(int num) {
		int count =0;
		String ckNum = "";
		ckNum = String.valueOf(num);
		for(int i=0; i<ckNum.length(); i++) {
			if(ckNum.charAt(i) == '3' || ckNum.charAt(i) == '6' || ckNum.charAt(i) == '9') {
				count++;
			}
		}
		return count;
	}

}
