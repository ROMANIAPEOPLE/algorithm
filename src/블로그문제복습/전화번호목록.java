package 블로그문제복습;

import java.util.Arrays;

//전화번호 접두사면 false
public class 전화번호목록 {
	public boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {

				if (phone_book[i].startsWith(phone_book[j])) {
					return false;
				}
			}
		}
		return true;
	}

}