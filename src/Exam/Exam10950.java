package Exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Exam10950 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int CASE = Integer.parseInt(br.readLine());
		
		for(int i=0; i<CASE; i++) {
			st= new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			int N= Integer.parseInt(st.nextToken());
			
			bw.write(T+N+"\n");
		}
		
		bw.flush();
		bw.close();
	
	}
}
