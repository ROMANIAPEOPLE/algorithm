package algorithm_Study;

public class ������ {

	public static void main(String[] args) {
		int k,c,i,j,f,n;
		int [][] a = new int[5][5];
		k=0; //1�� �����Ǵ� ���ڰ� ����� ����
		c=1; // ��� ���� ���� Ȥ�� ���� ���ο� ���̴� ����
		i=0; //�迭�� ���� ��ġ
		j=-1; // �迭�� ���� ��ġ
	
		f=5;
		while(true) {
			for(n=1; n<=f; n++) {
				k++;
				j+=c;
				a[i][j]=k;
			}
			
			f--;
			
			if(f<=0) {
				break;
			}
			
			for(n=1; n<=f; n++) {
				k++;
				i+=c;
				a[i][j]=k;
			}
			
			c*=-1;
			
			
			
			
		}
		
	}

}
