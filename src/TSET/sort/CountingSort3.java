package TSET.sort;

public class CountingSort3 {
	
	
	static void countingSort(char [] a) {
		
		int count = 0;
		for(char c : a) {
			if( c == '0') count ++;
		}
		for(int i=0; i<a.length; i++) {
			a[i]= (i<count) ? '0': '1'; 
		}
		
		
	}
	

	public static void main(String[] args) {

		
		char[] a = "0101000010100010111110011100000001111".toCharArray();  
		countingSort(a);         
		System.out.printf("[%s]\n", new String(a)); 

		
	}

}
