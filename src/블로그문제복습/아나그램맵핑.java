package ��α׹�������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//�Է� : 11,27,45,31,50 
//�Է� : 50,11,31,45,27
//��� : 1 4 3 2 0

public class �Ƴ��׷����� {

	public static void main(String[] args) {
		int [] A = {11,27,45,31,50};
		int [] B = {50,11,31,45,27};
		
		Map<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list  = new ArrayList<>();
		for(int i=0; i<B.length; i++) {
			map.put(B[i],i);
		}

		
		for(int i=0; i<A.length; i++) {
			list.add(map.get(A[i]));
		}
		
		System.out.println(list.toString());
	}
}
