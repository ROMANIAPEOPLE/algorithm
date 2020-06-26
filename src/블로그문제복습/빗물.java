package 블로그문제복습;

public class 빗물 {

	public static void main(String[] args) {
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};

		int res = 0;
		
		int [] left = new int[nums.length];
		int [] right = new int[nums.length];
		
		
		int max = nums[0];
		left[0] = nums[0];
		
		for(int i =1; i<left.length; i++) {
			if(max < nums[i]) {
				left[i] = nums[i];
				max = nums[i];
			}
			else {
				left[i] = max;
			}
		}
		
		max = nums[nums.length-1];
		right[nums.length-1] = nums[nums.length-1];
		
		for(int i=nums.length-2; i>=0; i--) {
			if(max< nums[i]) {
				right[i] = nums[i];
				max  = nums[i];
			}else {
				 right[i] = max;
			}
		}

		for(int i=0; i<nums.length; i++) {
			res+= Math.min(left[i], right[i])-nums[i];
		}
		
		System.out.println(res);
		
	}
}
