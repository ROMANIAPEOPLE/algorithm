package ��α׹�������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class �׷�Ƴ� {

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		

		ArrayList<ArrayList<String>> res = new ArrayList<>();

		Map<String, ArrayList<String>> map = new HashMap<>();
		
		
		for(String s : str) {
			char [] c = s.toCharArray();
			
			Arrays.parallelSort(c);
			
			String key = String.valueOf(c);
			
			if(map.containsKey(key)) {
				map.get(key).add(s);
			}else {
				ArrayList<String> list = new ArrayList<>();
				list.add(s);
				map.put(key, list);
			}
		}
		res.addAll(map.values());
		

		System.out.println(res);
		
		
		
		
		
	}
	
}
