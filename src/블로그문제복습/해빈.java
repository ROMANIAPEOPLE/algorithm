package 블로그문제복습;

import java.util.HashMap;
import java.util.Map;

public class 해빈 {
	public int solution(String[][] clothes) {
		int result=1;

		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			Integer count = map.get(clothes[i][1]);
			map.put(clothes[i][1], count == null ? 1 : count+1);
		}
		
		for(String s : map.keySet()) {
			result*= (map.get(s)+1);
		}
		
		return result-1;
		
	}
}
