package 블로그문제복습;

import java.util.HashSet;
import java.util.Set;

//* 결과값 : testmail@coding.com 
//* 결과값 : testmail@cod.ing.com
//* -> 총 몇개?

public class 유니크 {
	static String[] arr = { "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com",
			"testemail+tom@cod.ing.com" };

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		

		
		for (String str : arr) {
			String email = getEmail(str);
			String domain = getDomain(str);
			set.add(email+"@"+domain);
		}
		
		
		for(String str : set) {
			System.out.println(str.toString());
		}
		

	}

	public static String getEmail(String email) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '.') {
				continue;
			}
			
			if(email.charAt(i) == '+' || email.charAt(i) == '@') {
				break;
			}

			sb.append(String.valueOf(email.charAt(i)));
			
		}
		
		return sb.toString();

	}

	public static String getDomain(String domain) {
		return domain.substring(domain.indexOf('@')+1);

	}

}
