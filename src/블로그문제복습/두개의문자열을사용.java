package ��α׹�������;

import java.util.HashMap;
import java.util.Map;

// �Է� : ccaabbb
// ��� : aabbb
public class �ΰ��ǹ��ڿ������ {

	public static void main(String[] args) {
		String s = "ccaabbb";

		System.out.println(solve(s));
	}

	public static int solve(String s) {
		int start = 0;
		int end = 0;
		int res = 0;
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();

		while (end < s.length()) {
			char c = s.charAt(end);
			map.put(c, map.getOrDefault(c, 0) + 1);
			if (map.get(c) == 1) {
				count++;
			}
			end++;

			while (count > 2) {
				char c2 = s.charAt(start);
				map.put(c2, map.get(c2) - 1);
				if (map.get(c2) == 0) {
					count--;
				}
				start++;
			}

			res = Math.max(res, end - start);
		}

		return res;
	}
}
