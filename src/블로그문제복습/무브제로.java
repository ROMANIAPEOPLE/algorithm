package ��α׹�������;

import java.util.ArrayList;

/*
 * �������� : 0�� �ڷ� �Ű�
 */

public class �������� {
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
