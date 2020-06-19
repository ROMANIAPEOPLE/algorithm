package 블로그문제복습;

import java.util.HashMap;
import java.util.Map;
public class MostTwoDistnct {

	public static void main(String[] args) {
		String s = "ccaabbb";

		
		System.out.println(solve(s) );
	}

	public static int solve(String s) {
		Map<Character, Integer> map = new HashMap<>();

		int count = 0;
		int end = 0;
		int start = 0;
		int res = 0;

		while (end < s.length()) {
			char c = s.charAt(end);
			map.put(c, map.getOrDefault(c, 0) + 1);

			if (map.get(c) == 1) {
				count++;
			}
			end++;
			
			while(count > 2) {
				char cTemp = s.charAt(start);
				map.put(cTemp, map.get(cTemp) -1);
				if(map.get(cTemp) == 0) count--;
				start++;
				
			}
	
			res = Math.max(res, end-start);
		}
		return res;

	}
}
