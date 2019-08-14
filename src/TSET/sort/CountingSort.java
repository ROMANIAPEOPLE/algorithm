package TSET.sort;

import java.util.Map;
import java.util.TreeMap;
//TreeMap »ç¿ë
public class CountingSort {

	
	
	static void countingSort(char [] a) {
		Map<Character, Integer> countMap = new TreeMap<>();
	
		for(char c : a) {
			Integer i = countMap.get(c);
			
			if( i == null)  i =0;
			countMap.put(c, i+1);
		}
		
		int index =0; 
		for(char c : countMap.keySet()) {
			for(int i=0; i<countMap.get(c); i++) {
				a[index++] = c;
			}
			
		}
		
		
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		char[] a = "hello world. good morning. how are you.".toCharArray(); 
		
		countingSort(a);
		System.out.println();

		
		System.out.printf("[%s]\n", new String(a)); 

		
		
		
		
	}

}
