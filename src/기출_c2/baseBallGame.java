package 기출_c2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class baseBallGame {

	static int strike, ball, out;
	final static int chances = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int randomNumber;

		while (true) {
			System.out.println("[야구게임 Start!]");
			ArrayList<Integer> computer = new ArrayList<Integer>();
			ArrayList<Integer> user = new ArrayList<Integer>();
			boolean[] ck = new boolean[10]; // random으로 뽑아낸 정수가 중복이 있는지 검사하기 위한 배열

			for (int i = 0; i < 3; i++) {
				do {
					randomNumber = ran.nextInt(10);
				} while (ck[randomNumber] == true);

				ck[randomNumber] = true;
				computer.add(randomNumber);
			}

			try {
				for (int chance = 1; chance <= chances; chance++) {
					strike = ball = out = 0;

					System.out.println("<" + chance + "번째 시도" + ">");
					System.out.print("숫자 3개를 입력하세요");

					for (int i = 0; i < 3; i++) {
						user.add(sc.nextInt());
					}

					Iterator<Integer> it = computer.iterator();
					Iterator<Integer> it2 = user.iterator();

					while (it.hasNext()) {
						int comNum = it.next();
						int userNum = it2.next();

						if (comNum == userNum)
							strike++;
						else {
							if (user.contains(comNum) == true)
								ball++;
							else
								out++;

						}
					}
					if (strike == 3) {
						System.out.println("정답입니다!");
						break;
					} else {
						System.out.println(strike + " strike  " + ball + " ball  " + out + " out");
					}
					System.out.printf("남은 기회 : %d\n", chances - chance);
					user.clear();
				}

				System.out.println("정답 : " + computer.toString());
				System.out.println("1. 게임 재시작");
				System.out.println("2. 게임 종료");
				int select = sc.nextInt();

				if (select == 1) {
					continue;
				} else if (select == 2) {
					System.exit(0);
				} else {
					System.out.println("입력오류. 게임을 종료합니다");
					System.exit(0);
				}

			} catch (InputMismatchException ex) {
				System.out.println("input error!");
				sc.nextLine();
				System.exit(0);
				continue;
			}

		}

	}

}
