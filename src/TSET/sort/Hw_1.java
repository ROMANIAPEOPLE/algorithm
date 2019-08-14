package TSET.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Hw_1 {

	static void Ssort(int[] a) {


		int [] temp = new int[a.length];
		
		int index =0;

		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				temp[index] = a[i];
				index++;
			}
		
		}
		

		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 !=0) {
				temp[index] = a[i];
				index++;
			}
		}
		
		for(int i=0; i<temp.length; i++) {
			a[i] = temp[i];
		}
		
	}

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 6, 5, 7, 8, 9, 24, 29, 19 };

		Ssort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
