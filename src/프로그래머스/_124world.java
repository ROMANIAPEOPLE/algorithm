package 프로그래머스;

public class _124world {
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	public static String solution(int n) {
		String ans ="";
		
		while(n!=0) {
			int temp = n%3;
			n = n/3;
			
			if(temp ==0) {
				temp=4;
				n--;
			}
			ans=temp+ans;
		}
		
		return ans;
	}
}
