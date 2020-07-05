package 프로그래머스;

public class 두정수사이의합 {
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
