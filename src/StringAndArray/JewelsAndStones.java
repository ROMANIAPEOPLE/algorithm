package StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	static String j = "aA";
	static String s = "aAAbbbb";
	
	public static void main(String[] args) {

		int count =0;
	
		Set<Character> set = new HashSet<>();
		
		for(char jew : j.toCharArray()) {
			set.add(jew);
		}
		
		for(char st : s.toCharArray()) {
			if(set.contains(st)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
