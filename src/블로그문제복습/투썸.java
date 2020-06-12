package 블로그문제복습;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 투썸 {
	
	static int [] nums = {2,5,7,12,13};
	static int target = 14;
	
	
	
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
	
		int [] res = new int[2];
		for(int i=0; i<nums.length; i++) {
		
			if(map.containsKey(nums[i])) {
				res[0] = map.get(nums[i]);
				res[1] = i;
			}
			else {
				map.put(target-nums[i], i);
			}
		}

		System.out.println(Arrays.toString(res));
		
		
		
	}

}
