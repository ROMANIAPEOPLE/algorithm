package inflearn_codingTest.StringAndArray;

public class PlusOne {
	public static void main(String[] args) {
		int[] nums = { 9, 9, 9 };
		int [] res = solve(nums);
		
		for(int i:res)
			System.out.println("val: "+i);
		
	}
	public static int[] solve(int nums[]) {
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != 9) {
				nums[i]++;
				break;
			} else {
				nums[i] = 0;
			}
		}

		if (nums[0] == 0) {
			int[] res = new int[nums.length + 1];
			res[0] = 1;
			return res;
		}
		return nums;
	}
	
}