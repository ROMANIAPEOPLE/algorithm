package ��α׹�������;

import java.util.Arrays;

//��ǲ : [9,9,9]
//�ƿ�ǲ : [1,0,0,0]

//��ǲ : [1,2,3]
//�ƿ�ǲ : [1,2,4]
public class ���󽺿� {

	public static void main(String[] d) {
		int [] input = {1,2,3};
		
		
		for(int i=input.length-1; i>=0; i--) {
			if(input[i] !=9) {
				input[i]++;
				break;
			}
			
			else {
				input[i] = 0;
			}
		}
		
		if(input[0] == 0) {
			int [] res = new int[input.length+1];
			
			res[0] = 1;
			
			
			for(int i=1; i<input.length; i++) {
				res[i] = input[i];
			}
			System.out.println(Arrays.toString(res));
		}
		
		else {
			System.out.println(Arrays.toString(input));
		}
		
		
		
	
		
		
		
	}
}
