package 블로그문제복습;

import java.util.HashSet;
import java.util.Set;

/*
 * 결과값 : testmail@coding.com 
 * 결과값 : testmail@cod.ing.com
 * -> 총 몇개?
 */


public class 유니크이메일 {
	public static void main(String[] args) {
		String[] arr = { "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com" };
		System.out.println(solve(arr));
	}
	
	public static int solve(String [] arr) {
		Set<String> set = new HashSet<>();
		
		for(String str : arr) {
			String email = getEmail(str);
			String domain = getDomain(str);
			set.add(email+"@"+domain);
		}
		
		return set.size();
		
	}
	
	public static String getEmail(String email) {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i) == '.') {
				continue;
			}
			
			if(email.charAt(i) == '@') {
				break;
			}
			
			if(email.charAt(i) == '+') {
				break;
			}
			
			builder.append(String.valueOf(email.charAt(i)));
		}
		return builder.toString();
		
	}
	
	public static String getDomain(String domain) {
		return domain.substring(domain.indexOf('@'));
		
	}

	
	
	
	
	
}
