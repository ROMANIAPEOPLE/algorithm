package TSET.sort;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortPersonVer {

	
	static void swap(Object [] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubbleSort(Object [] a, Comparator comparator) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(comparator.compare(a[j], a[j+1]) > 0) {
					swap(a,j,j+1);
				}
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Person[] a = new Person[] {         
				  new Person("ȫ�浿", 18), new Person("�Ӳ���", 22), new Person("�̸���", 17),    
				  new Person("����ġ", 23), new Person("��û", 16), new Person("�����", 38) };     
		  
		bubbleSort(a, new PersonNameComparator());        
		  System.out.println(Arrays.toString(a)); 


	}

}
