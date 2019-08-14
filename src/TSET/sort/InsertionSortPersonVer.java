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

		Person[] a = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 22), new Person("�̸���", 17),
				new Person("����ġ", 23), new Person("��û", 16), new Person("�����", 38) };

		insertionSort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));

	}

}
