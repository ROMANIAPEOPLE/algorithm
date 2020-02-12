package 코딩테스트_BASIC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Q7 {

	static int solution(List<Integer> list) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int value : list) {
			Integer count = map.get(value);
			map.put(value, count == null ? 1 : count+1);
		}
		int maxValue = 0;
		int maxCount = 0;
		
		for(int value : map.keySet()) {
			if(map.get(value) > maxCount) {
				maxCount = map.get(value);
				maxValue = value;
			}
		}

		return maxValue;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<20; i++) {
			list.add(random.nextInt(10)+1);
		}
		
		System.out.println(list.toString());
		
		System.out.println(solution(list));
		
	}
	
}
