package ��α׹�������;

import java.util.ArrayList;
import java.util.List;

//[0->1 , 4, 6->49 , 51->74, 76->99]
public class �̾ŷ����� {
	public static void main(String[] args) {
		int [] nums = {2,3,5,50,75};
		int lower = 0;
		int upper = 99;
			
		List<String> list = new ArrayList<>();
		
		if(lower < nums[0]) { //0->1 ��½�Ű�� ���� ����
			list.add(make(lower,nums[0]-1));
		}
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]+1 != nums[i+1]) {
				list.add(make(nums[i]+1, nums[i+1]-1));
			}
		}
		
		if(nums[nums.length-1] < upper) {
			list.add(make(nums[nums.length-1]+1,upper));
		}
		
		System.out.println(list.toString());
		
	}
	
	public static String make(int low, int high) {
		return low==high ? String.valueOf(low) : (low + "->" + high);
	}

}
