package TSET.sort;

import java.util.Arrays;
import java.util.Comparator;

public class InsertionSortPersonVer {
	
	
	static void insertionSort(Object [] a , Comparator comparator) {
		for(int i=1; i<a.length; i++) {
			Object value = a[i]; 
			int j;
			for(j=i-1; j>=0; j--) {
				if(comparator.compare(a[j], value) >0) {
					a[j+1] = a[j];
				}
				else break;
			}
			
			a[j+1] = value;
		}
	}
	

	public static void main(String[] args) {

		Person[] a = new Person[] { new Person("È«±æµ¿", 18), new Person("ÀÓ²©Á¤", 22), new Person("ÀÌ¸ù·æ", 17),
				new Person("Àü¿ìÄ¡", 23), new Person("½ÉÃ»", 16), new Person("¿¬ÈïºÎ", 38) };

		insertionSort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));

	}

}
