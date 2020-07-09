package 프로그래머스;

public class 키패드누르기_다시 {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		System.out.println(solution(numbers, hand));

	}

	public static String solution(int[] n, String hand) {
		StringBuilder bd = new StringBuilder();

		int leftLocation = 10;
		int rightLocation = 12;

		for (int number : n) {
			if (number == 1 || number == 4 || number == 7) {
				bd.append("L");
				leftLocation = number;
			} else if (number == 3 || number == 6 || number == 9) {
				bd.append("R");
				rightLocation = number;
			} else { // 2 5 8 0
				int distanceL = getDist(leftLocation, number);
				int distanceR = getDist(rightLocation, number);

				if (distanceL > distanceR) {
					bd.append("R");
					rightLocation = number;
				} else if (distanceL < distanceR) {
					bd.append("L");
					leftLocation = number;
				} else {
					if (hand.equals("right")) {
						bd.append("R");
						rightLocation = number;
					} else {
						bd.append("L");
						leftLocation = number;
					}
				}

			}
		}
		return bd.toString();
	}

	public static int getDist(int location, int number) {

		if (number == 0) {
			number = 11;
		}

		if (location == 0) {
			location = 11;
		}

		int locationX = (location - 1) / 3;
		int locationY = (location - 1) % 3;

		int numberX = (number - 1) / 3;
		int numberY = (number - 1) % 3;

		return Math.abs(locationX - numberX) + Math.abs(locationY - numberY);

	}
}