package TSET.sort;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSortPersonVer {

	 static void swap(Object[] a, int i, int j) {
		 Object temp = a[i];  
		 a[i] = a[j];     
		 a[j] = temp;    
		 } 

	
	
	
	static int findMin(Object [] a , int start, Comparator comparator) {
		Object minValue = a[start];
		int minIndex =start;
		for(int i= start+1; i<a.length; i++) {
			if(comparator.compare(a[i], minValue) <0) {
				minValue = a[i];
				minIndex =i;
			}
	
		}

		return minIndex;
	}
	
	

	static void selectionSort(Object[] a, Comparator comparator) {

		for(int i=0; i<a.length-1; i++) {
			int minIndex = findMin(a,i,comparator);
			swap(a,i,minIndex);
		}
	}
	
	
	
	
	public static void main(String[] args) {

		
		
		
		
		
		Person[] a = new Person[] {         
				  new Person("È«±æµ¿", 18), new Person("ÀÓ²©Á¤", 22), new Person("ÀÌ¸ù·æ", 17),    
				  new Person("Àü¿ìÄ¡", 23), new Person("½ÉÃ»", 16), new Person("¿¬ÈïºÎ", 38) };     
		  
		  selectionSort(a, new PersonNameComparator());        
		  System.out.println(Arrays.toString(a)); 

	}

}
