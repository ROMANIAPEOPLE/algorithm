package ����_c2;

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
			System.out.println("[�߱����� Start!]");
			ArrayList<Integer> computer = new ArrayList<Integer>();
			ArrayList<Integer> user = new ArrayList<Integer>();
			boolean[] ck = new boolean[10]; // random���� �̾Ƴ� ������ �ߺ��� �ִ��� �˻��ϱ� ���� �迭

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

					System.out.println("<" + chance + "��° �õ�" + ">");
					System.out.print("���� 3���� �Է��ϼ���");

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
						System.out.println("�����Դϴ�!");
						break;
					} else {
						System.out.println(strike + " strike  " + ball + " ball  " + out + " out");
					}
					System.out.printf("���� ��ȸ : %d\n", chances - chance);
					user.clear();
				}

				System.out.println("���� : " + computer.toString());
				System.out.println("1. ���� �����");
				System.out.println("2. ���� ����");
				int select = sc.nextInt();

				if (select == 1) {
					continue;
				} else if (select == 2) {
					System.exit(0);
				} else {
					System.out.println("�Է¿���. ������ �����մϴ�");
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
