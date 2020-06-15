package 블로그문제복습;

import java.util.Arrays;

public class 플러스원 {

	static int [] nums = {3,8,9,9};
	
	public static void main(String[] args) {
		
		int [] res = solve(nums);
		
		
		System.out.println(Arrays.toString(res));
	}
	
	public static int [] solve(int [] nums) {
		for(int i=nums.length-1; i>=0; i--) {
			if(nums[i] != 9) {
				nums[i]++;
				break;
			}
			else { // 9라면?
				nums[i] = 0;
			}
		}
		
		if(nums[0] == 0) {
			int [] newRes = new int[nums.length+1];
			newRes[0] = 1;
			return newRes; 
		}
		return nums;
	}

}
