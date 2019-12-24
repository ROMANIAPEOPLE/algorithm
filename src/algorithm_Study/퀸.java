package algorithm_Study;
import java.util.Scanner;

public class 퀸 {
	
	static int [] map; // 행과 열을 저장할 배열
	static int n; // n x n 크기의 체스판을 선언할 변수
	static int count=0; //퀸이 위치할 수 있는 경우의 수를 저장할 변수

	public static boolean check(int [] map, int index) {
		for(int i=1; i<index; i++) {
			if(map[i] == map[index]) return false; //같은 열에 위치하고 있다면 퀸을 배치할 수 없음
			if(Math.abs(i-index) == Math.abs(map[i] - map[index])) return false; //대각선에 위치하고있다면 배치 X
		}
		return true;
	}
	
	public static void bt(int [] map, int index) {
		if(index == n) { //n행까지 도달했다면, 모든 퀸을 배치했다는 뜻 이므로, count++
			count++;
		}
		
		else {
			for(int i=1; i<=n; i++) {
				map[index+1] = i; //다음행의 i열에 퀸을 놓을 수 있는지 확인하는 작업
				if(check(map,index+1)) {
					bt(map,index+1);
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			map = new int[n+1]; //0행 사용X로 인하여 n+1크기의 int형 배열 생성
			map[1] =i; //1행부터 시작하고, i~n열을 모두 탐색함.
			bt(map,1);
			
		}
		
		System.out.println(count);
		
		
		
	}
	
}
