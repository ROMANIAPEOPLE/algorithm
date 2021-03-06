package TSET;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapSet {

	static int solution(List<Integer> a) {
		Map<Integer, Integer> map  = new HashMap<>();
		for(int key : a) {
			Integer count = map.get(key);
			map.put(key, count == null ? 1 : count+1); 
		}
		
		int maxValue =0; 
		int maxCount =0;
		
		for(int value : map.keySet()) {
			if(map.get(value) > maxCount) {
				maxCount = map.get(value);
				maxValue = value;
			}
		}
		
		return maxValue;
		
	}
	
	
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 20; ++i)
			a.add(random.nextInt(10) + 1);
		System.out.println(a.toString());
		int maxValue = solution(a);
		System.out.println(maxValue);
	}
}