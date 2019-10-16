package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam2309_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}

		Arrays.parallelSort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					for (int k = 0; k < arr.length; k++) {
						if (i == k || j == k)
							continue;
						System.out.println(arr[k]);
					}
					System.exit(0);
					
				}
			}
		}

	}
}
