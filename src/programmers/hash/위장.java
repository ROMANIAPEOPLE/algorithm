package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class ¿ß¿Â {

	public int solution(String[][] clothes) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0; i<clothes.length; i++) {
				Integer count =map.get(clothes[i][1]);
				map.put(clothes[i][1], count == null ? 1 : count+1);
		}
		

		int result=1;
		
		for(String key : map.keySet()) {
			result *=(map.get(key)+1);
		}
		
		return result-1;
		
	
	}
}