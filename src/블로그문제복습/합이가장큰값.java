package 블로그문제복습;
//입력 : -2,1,-3,4,-1,2,1,-5,4
// 출력 : 6
public class 합이가장큰값 {

	public static void main(String[] args) {
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(solve(nums));
	}
	public static int solve(int [] nums) {
		int res = nums[0];
		int sum = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			sum = Math.max(nums[i], sum+nums[i]);
			res = Math.max(res, sum);
		}
		
		return res;
	}
}
