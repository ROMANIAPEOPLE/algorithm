package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pair[] arr = new Pair[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Pair(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.parallelSort(arr);
		
		int count =1;
		int end = arr[0].end;
		for(int i=1; i<n; i++) {
			if(arr[i].start >=end) {
				count++;
				end=arr[i].end;
			}
		}
		
		System.out.println(count);
		
	}
}

class Pair implements Comparable<Pair> {
	int start;
	int end;

	public Pair(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Pair p) {
		int r = this.end - p.end;
		if (r == 0) {
			r = this.start - p.start;
		}
		return r;
	}
}