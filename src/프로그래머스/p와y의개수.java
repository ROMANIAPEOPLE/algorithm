package ���α׷��ӽ�;
//https://programmers.co.kr/learn/courses/30/lessons/12916
public class p��y�ǰ��� {
	public static void main(String[] args) {
//		String s = "pPoooyY";
		String s = "Pyy";
		
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
		boolean answer = true;

		s = s.toLowerCase(); //���� �ҹ��ڷ� ����
		
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