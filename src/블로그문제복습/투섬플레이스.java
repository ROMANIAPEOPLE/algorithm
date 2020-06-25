package 블로그문제복습;

import java.util.HashMap;
import java.util.Map;

public class 투섬플레이스 {

	public static void main(String[] args) {
		 int [] nums = {2,5,7,12,13};
		 int target = 14;

		int [] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			
			
			if(map.containsKey(nums[i])) {
				result[0] = map.get(nums[i]);
				result[1] = i;
			}
			else {
				map.put(target-nums[i], i);
			}
			
		}

		for(int s : result) {
			System.out.print(s+" ");
		}
		
	}
}
