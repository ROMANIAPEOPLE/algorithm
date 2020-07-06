package 프로그래머스;
//https://programmers.co.kr/learn/courses/30/lessons/12916
public class p와y의개수 {
	public static void main(String[] args) {
//		String s = "pPoooyY";
		String s = "Pyy";
		
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
		boolean answer = true;

		s = s.toLowerCase(); //전부 소문자로 변경
		
		int p =0;
		int y=0;
		
		for(String str : s.split("")) {
			if(str.equals("p")) {
				p++;
			}
			if(str.equals("y")) {
				y++;
			}
		}
		
		if(p!=y) answer = false;
		
		
		return answer;
	}
}