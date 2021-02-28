

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
		int get = nums.length / 2;
		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
		Arrays.sort(nums);
		for(int n: nums){
			sum.put(n, sum.getOrDefault(n, 0) + 1);
		}
		if (get < sum.size())
			return get;
		return sum.size();
	}
	
	public int solution2(int nums[]){
		HashSet<Integer> sum = new HashSet<>();
		for(int n : nums){
			sum.add(n);
		}
		if(nums.length / 2 < sum.size())
			return nums.length / 2;
		return sum.size();
	}
}
