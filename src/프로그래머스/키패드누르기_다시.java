package 프로그래머스;

public class 키패드누르기_다시 {

	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";

		System.out.println(solution(numbers, hand));

	}
	public static String solution(int [] n, String hand) {
		int [] phone = {'1','2','3','4','5','6','7','8','9','*','0','#'};
		int posL=9;
		int posR=11;
		
		StringBuilder bd = new StringBuilder();
		
		for(int number : n) {
			if(number == '1' || number == '4' || number == '7') {
				posL = number;
				bd.append("L");
			}
			else if(number == '3' || number == '6' || number == '9') {
				posR = number;
				bd.append("R");
			}
			else {
				if(getXY(posL,posR,number,hand) == "R") {
					posR = number;
					bd.append("R");
				}else {
					posL = number;
					bd.append("L");
				}
			}
			
		}
		return bd.toString();
	}
	public static String getXY(int posL, int posR , int number,String hand) {
		int numX = (number-1) /3;
		int numY = (number-1) %3;
		
		int leftX = (posL-1) /3;
		int leftY = (posL-1) %3;
		
		int rX = (posR-1) /3;
		int rY = (posR-1) %3;
		
		int leftValue = (int) Math.abs((Math.pow(leftX-numX, 2) + Math.pow(leftY-numY,2)));
		int rValue = (int) Math.abs((Math.pow(rX-numX, 2) + Math.pow(rY-numY,2)));
		
		if(leftValue > rValue) {
			return "R";
		}
		else if(leftValue < rValue) {
			return "L";
		}
		else {
			if(hand.equals("right")) {
				return "R";
			}else {
				return "L";
			}
			
		}
		
		
	}
}