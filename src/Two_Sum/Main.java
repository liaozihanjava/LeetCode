package Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	/*public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int x = 0; x < nums.length; x++) {
			result = new int[2];
			result[0] = x;
			for (int y = x + 1; y < nums.length; y++) {
				if ((nums[x] + nums[y]) == target) {
					result[1] = y;
					return result;
				} else {
					continue;
				}
			}
		}
		if((result[0] == nums.length-1)&&(result[1] == 0)){
			result = new int[2];
		}
		return result;
	}*/
	public static int[] twoSum(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();  
		for(int x = 0; x < nums.length;x++){
			if(map.containsKey(nums[x])){
				return new int[]{map.get(nums[x]),x};
			}
			else{
				map.put(target-nums[x], x);
			}
			
		}
		return new int[2];
	}

	public static void main(String[] args) {
		int[] nums = { 2, 5, 7, 11 };
		int target = 14;
		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
