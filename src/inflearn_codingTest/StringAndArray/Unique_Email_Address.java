package inflearn_codingTest.StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Address {

	public static void main(String[] args) {
		String[] arr = { "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com" };
		System.out.println(solve(arr));

	}

	public static int solve(String[] arr) {

		Set<String> set = new HashSet<>();

		for (String email : arr) {
			String emails = getEmail(email);
			String domain = getDomain(email);
			set.add(emails + "@" + domain);
		}

		print(set);
		return set.size();

	}

	public static void print(Set<String> set) {
		for (String s : set) {
			System.out.println(s);
		}
	}

	public static String getEmail(String email) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '.') {
				continue;
			}

			if (email.charAt(i) == '+') {
				break;
			}

			if (email.charAt(i) == '@') {
				break;
			}
			String str = String.valueOf(email.charAt(i));
			sb.append(str);
		}

		return sb.toString();

	}

	public static String getDomain(String email) {

		return email.substring(email.indexOf('@') + 1);

	}

}
