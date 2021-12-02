package leetcode.easy;

import java.util.HashMap;

/**
 * @author Mohit Dodhia
 */
public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		
		int[] ans = new TwoSum().twoSum(nums , target);
		
		System.out.println(ans[0] + ", " + ans[1]);
	}
	
	/**
	 * @param nums : array of numbers
	 * @param target : sum of numbers to be achieved by adding two indices from nums
	 * @return an array containing indices of the two numbers such that they add up to target
	 */
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]), i};
			}
			
			map.put(nums[i], i);
		}
		
		return new int[] {0, nums.length - 1};
	}

}
