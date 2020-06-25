package ��α׹�������;

/*
 * �ϳ��� ȸ�ǽǿ��� ȸ�������� �����ϴٸ� true, �׷��� �ʴٸ� false
 */

import java.util.Arrays;

class room {
	int start;
	int end;

	room(){
		this.start=0;
		this.end=0;
	}
	
	
	room(int start, int end) {
		this.start=start;
		this.end=end;
	}
}

public class ����1 {
	public static void main(String[] args) {
		room in1 = new room(7,10);
		room in2 = new room(2,4);
		
		room [] r = {in1,in2};
		
		
		
		System.out.println(solve(r));

	}
	
	public static boolean solve(room [] r) {
		Arrays.sort(r,(o1,o2) -> o1.start-o2.start);
		for(int i=1; i<r.length; i++) {
			if(r[i-1].end > r[i].start) {
				return false;
			}
		}
		
		return true;
	}

}
