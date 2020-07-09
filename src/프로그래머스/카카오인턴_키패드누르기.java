package 프로그래머스;

public class 카카오인턴_키패드누르기 {

	public static void main(String[] args) {
		int [] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";

		System.out.println(solution(numbers,hand));
		
	}

	public static String solution(int[] n, String hand) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -2, 0, -2 };
		int[][] phone = new int[4][3];
		int k = 0;

		for (int i = 0; i < phone.length; i++) {
			for (int j = 0; j < phone[i].length; j++) {
				phone[i][j] = number[k++];

			}
		}
		for (int i = 0; i < phone.length; i++) {
			System.out.println();
			for (int j = 0; j < phone[i].length; j++) {
				System.out.print(phone[i][j] + " ");
			}
		}
		////////////////////////////// 폰만들기 ////////////////////////////

		StringBuilder bd = new StringBuilder();

		int locationLeft = phone[3][0];
		int locationRigth = phone[3][2];
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 1 || n[i] == 4 || n[i] == 7) {
				locationLeft = n[i];
				bd.append("L");
			} else if (n[i] == 3 || n[i] == 6 || n[i] == 9) {
				locationRigth = n[i];
				bd.append("R");
			} else {
				int phoneX = getX(n[i], phone);
				int phoneY = getY(n[i], phone);

				int leftX = getX(locationLeft, phone);
				int leftY = getY(locationLeft, phone);

				int rightX = getX(locationRigth, phone);
				int rightY = getY(locationRigth, phone);

			    int left =(int) Math.abs(Math.pow((leftX-phoneX),2) +Math.pow((leftY-phoneY),2));
				int right = Math.abs(
						((rightX - phoneX) * (rightX - phoneX)) + Math.abs(((rightY - phoneY) * (rightY - phoneY))));

				if (left > right) {
					locationRigth = n[i];
					bd.append("R");
				} else if (left < right) {
					locationLeft = n[i];
					bd.append("L");
				} else {
					if (hand.equals("right")) {
						locationRigth = n[i];
						bd.append("R");
					} else if (hand.equals("left")) {
						locationLeft = n[i];
						bd.append("L");
					}
				}

			}

		}

		return bd.toString();
		
	}

	public static int getX(int num, int[][] phone) {
		for (int i = 0; i < phone.length; i++) {
			for (int j = 0; j < phone[i].length; j++) {
				if (phone[i][j] == num) {
					return i;
				}
			}
		}
		return -1;
	}

	public static int getY(int num, int[][] phone) {
		for (int i = 0; i < phone.length; i++) {
			for (int j = 0; j < phone[i].length; j++) {
				if (phone[i][j] == num) {
					return j;
				}
			}
		}
		return -1;
	}

}
