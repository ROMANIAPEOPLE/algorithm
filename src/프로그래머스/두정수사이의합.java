package ���α׷��ӽ�;

public class �������������� {
	public static void main(String[] args) {
		System.out.println(solution(5,3));
	}
	
	public static long solution(int a, int b) {
		long answer=0;
		
		if(a>b) {
			int temp =a;
			a=b;
			b=temp;
		}
		
		for(long i =a; i<=b; i++) {
			answer+=i;
		}
		
		
		return answer;
	}
}
