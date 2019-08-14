package TSET.코딩테스트;
import java.util.Arrays;
import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] array = {50000,10000,5000,1000,500,100,50,10,1};

		int [] temp = new int[9];
		
		int num = sc.nextInt();
		
		
		for(int i=0; i<temp.length; i++) {
			temp[i]= num/array[i];
			num= num % array[i];
		}
		
		System.out.println(Arrays.toString(temp));
		
		
		
		
		
		
		
	}

}
