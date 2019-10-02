package algorithm_Study;

public class 달퐁이 {

	public static void main(String[] args) {
		int k,c,i,j,f,n;
		int [][] a = new int[5][5];
		k=0; //1씩 증가되는 숫자가 저장될 변수
		c=1; // 행과 열의 증가 혹은 감소 여부에 쓰이는 변수
		i=0; //배열의 행의 위치
		j=-1; // 배열의 열의 위치
	
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
