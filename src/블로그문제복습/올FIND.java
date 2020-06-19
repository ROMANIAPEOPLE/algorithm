package 블로그문제복습;

import java.util.ArrayList;
import java.util.List;

public class 올FIND {
	public static void main(String[] args) {
		String txt = "BACDGABCDA";
		String pat = "ABCD";
		
		List<Integer> list = new ArrayList<>();
		list = solve(txt,pat);
		System.out.println(list.toString());
		
	}
	public static List<Integer> solve(String txt, String pat){
		
		ArrayList<Integer> list = new ArrayList<>();
		int [] patArr = new int[256];
		for(int i=0; i<pat.length(); i++) {
			patArr[pat.charAt(i)]++;
		}
		
		for(int i=0; i<txt.length()-pat.length()+1; i++) {
			int [] txtArr = new int[256];
			for(int j=0; j<pat.length(); j++) {
				txtArr[txt.charAt(i+j)]++;
			}
			if(check(txtArr,patArr)) {
				list.add(i);
			}
			
		}
		return list;
		
	}
	
	public static boolean check(int[] patArr, int[] txtArr) {
		for(int i=0; i<patArr.length; i++) {
			if(patArr[i] != txtArr[i]) {
				return false;
			}
		}
		return true;
	}

}
