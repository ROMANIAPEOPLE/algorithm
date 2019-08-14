package algorithm_Study;

import java.util.Map;
import java.util.TreeMap;

public class CountingSort1 {

	static void countingSort(char[] a) {
		Map<Character, Integer> map = new TreeMap<>();

		for (char c : a) {

			Integer count = map.get(c);
			if (count == null) {
				count = 1;
			} else {
				count += 1;
			}
			
			map.put(c,count);
			
		}
	
		int index =0;
		for(char c : map.keySet()) {
			for(int i=0; i<map.get(c); i++) {
				a[index++]=c;
				
			}
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		char[] a = "hello world. good morning. how are you.".toCharArray();
		countingSort(a);
		System.out.printf("[%s]\n", new String(a));

	}

}
