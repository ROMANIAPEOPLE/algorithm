package TSET.sort;

import java.util.Arrays;
import java.util.Random;

public class 평균선형시간검색 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int partition(int [] a, int start, int end) {
		int value = a[end];
		int i = start-1;
		for(int j=start; j<end; j++) {
			if(a[j] < value) {
				swap(a,++i,j);
			}
		}
		
		swap(a,i+1,end);
		return i+1;
	}

	static int select(int[] a, int start, int end, int nth) {
		if(start>=end) return a[start];
		int middle = partition(a, start, end);
		int nth_middle = middle-start+1;
		if(nth == nth_middle) return a[middle];
		else if( nth < nth_middle)  return select(a,start,middle-1, nth);
		else return select(a,middle+1,end,nth-nth_middle);
		
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(20);
		System.out.println(Arrays.toString(a));
		System.out.printf("1 踰덉㎏ �옉�� 媛� = %d\n", select(a, 0, a.length - 1, 1));
		System.out.printf("2 踰덉㎏ �옉�� 媛� = %d\n", select(a, 0, a.length - 1, 2));
		System.out.printf("3 踰덉㎏ �옉�� 媛� = %d\n", select(a, 0, a.length - 1, 3));
		System.out.printf("4 踰덉㎏ �옉�� 媛� = %d\n", select(a, 0, a.length - 1, 4));

	}

}
