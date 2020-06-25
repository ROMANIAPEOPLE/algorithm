package ��α׹�������;

import java.util.HashSet;
import java.util.Set;

/*
 * ����� : testmail@coding.com 
 * ����� : testmail@cod.ing.com
 * -> �� �?
 */


public class ����ũ�̸��� {
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
