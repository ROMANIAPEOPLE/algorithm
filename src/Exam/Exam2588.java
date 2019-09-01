package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a *(b%10));
		System.out.println(a*((b/10)%10));
		System.out.println(a* (b/100));
		System.out.println(a*b);
	}
}
