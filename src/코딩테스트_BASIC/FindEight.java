package �ڵ��׽�Ʈ_BASIC;


//1~10000 ����  ������ ���� 8�� ��� ��Ÿ������!
public class FindEight {
	public static void main(String[] args) {
		int to = 1;
		int from =10000;
		int count =0;
		for(int i =to; i<=from; i++) {
			int temp = i;
			
			while(temp>0) {
				if(temp % 10 ==8) {
					count++;
				}
			
				temp /= 10;
				
			}
		}
		System.out.println(count);
		
	}
}
