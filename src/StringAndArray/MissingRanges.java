package StringAndArray;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	
	public static void main(String [] args) {
		int[] nums = {2,3,5,50,75};
		int lower =0, upper =99;
		
		System.out.println(solve(nums,lower,upper));
	}
	
	public static List<String> solve(int[] nums, int lower, int upper){
		
		ArrayList<String> list = new ArrayList<>();
		if(lower < nums[0]) {
			list.add(makeRange(lower,nums[0]-1));
		}
		
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]+1 !=nums[i+1]) {
				list.add(makeRange(nums[i]+1, nums[i+1]-1));
			}
			
			
//			if(nums[i]+1 < nums[i+1] && nums[i]!=nums[i+1]) {
//				list.add(makeRange(nums[i]+1,nums[i+1]-1));
//			}
		}
		
		if(nums[nums.length-1] < upper) {
			list.add(makeRange(nums[nums.length-1]+1, upper));
		}
		
		
		return list;
		
		
	}
	
	public static String makeRange(int low, int high) {
		return low==high ? String.valueOf(low) : (low + "->"+high);
	}
	
}