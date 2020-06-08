package inflearn_codingTest.StringAndArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	static int [] nums = {2,8,11,21};
	static int target = 10;
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int [] result = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				result[0] = map.get(nums[i]);
				result[1] = i;
				
			}else {
				map.put(target-nums[i], i);
			}
		}
		
		System.out.println(Arrays.toString(result));
		

		
		
	}
	
	
}
