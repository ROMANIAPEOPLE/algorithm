package StringAndArray;

public class TrappingRainWater {

	public static void main(String[] args) {
		int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int [] lefts = new int[nums.length];
		int [] rights= new int[nums.length];
			
		int max = nums[0];
		lefts[0]  = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(max < nums[i]) {
				lefts[i] = nums[i];
				max = nums[i];
			}else {
				lefts[i]=max;
			}
		}
		max = nums[nums.length-1];
		rights[nums.length-1] =nums[nums.length-1];
		
		for(int i=nums.length-2; i>=0; i--) {
			if(max < nums[i]) {
				rights[i] = nums[i];
				max = nums[i];
			}else {
				rights[i] = max;
			}
		}
		int res=0;
		
		for(int i=0; i<nums.length; i++) {
			res += Math.min(lefts[i], rights[i])-nums[i];
		}
		
		System.out.println(res);
		
	}

}
