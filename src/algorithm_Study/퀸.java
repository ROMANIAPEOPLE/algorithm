package algorithm_Study;
import java.util.Scanner;

public class �� {
	
	static int [] map; // ��� ���� ������ �迭
	static int n; // n x n ũ���� ü������ ������ ����
	static int count=0; //���� ��ġ�� �� �ִ� ����� ���� ������ ����

	public static boolean check(int [] map, int index) {
		for(int i=1; i<index; i++) {
			if(map[i] == map[index]) return false; //���� ���� ��ġ�ϰ� �ִٸ� ���� ��ġ�� �� ����
			if(Math.abs(i-index) == Math.abs(map[i] - map[index])) return false; //�밢���� ��ġ�ϰ��ִٸ� ��ġ X
		}
		return true;
	}
	
	public static void bt(int [] map, int index) {
		if(index == n) { //n����� �����ߴٸ�, ��� ���� ��ġ�ߴٴ� �� �̹Ƿ�, count++
			count++;
		}
		
		else {
			for(int i=1; i<=n; i++) {
				map[index+1] = i; //�������� i���� ���� ���� �� �ִ��� Ȯ���ϴ� �۾�
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
			map = new int[n+1]; //0�� ���X�� ���Ͽ� n+1ũ���� int�� �迭 ����
			map[1] =i; //1����� �����ϰ�, i~n���� ��� Ž����.
			bt(map,1);
			
		}
		
		System.out.println(count);
		
		
		
	}
	
}
