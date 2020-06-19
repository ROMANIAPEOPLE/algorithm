package 블로그문제복습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 그룹아나그램 {
	 public static void main(String[] args) {
			
			String[] list =  {"eat", "tea", "tan", "ate", "nat", "bat"};
	
			
			System.out.println(groupAnagrams(list));
		}
	 
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
	        List<List<String>> result = new ArrayList<>();
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	 
	        

	        for(String str : strs) {
	        	char[] arr = new char[256];
	        	for(int i=0; i<str.length(); i++) {
	        		arr[str.charAt(i)]++;
	        	}
	        	String ns = new String(arr);

	        	if(map.containsKey(ns)) {
	        		map.get(ns).add(str);
	        	}else {
	        		ArrayList<String> a1 = new ArrayList<>();
	        		a1.add(str);
	        		map.put(ns, a1);
	        	}
	        	
	        }
	        
	        result.addAll(map.values());
	        
	        
	 
	        return result;
	 }
	 
}
