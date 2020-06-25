package 블로그문제복습;

import java.util.ArrayList;

/*
 * 무브제로 : 0을 뒤로 옮겨
 */

public class 무브제로 {
	public static void main(String[] args) {
		int [] input = {0,1,0,3,12};

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<input.length; i++) {
			if(input[i] !=0) {
				list.add(input[i]);
			}
		}
		

		for(int i=list.size(); i<input.length; i++) {
			list.add(0);
		}
		System.out.println(list.toString());
		
	}

}
