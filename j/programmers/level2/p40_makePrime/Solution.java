package programmers.level2.p40_makePrime;

import java.util.ArrayList;

class Solution {
	public static void makeCombination(int [] arr, ArrayList<Integer> list, int r, int[] temp, int current, int start) {
		if (r == current) {
			int sum = 0;
			for(int i = 0; i < 3; i++)
				sum+=temp[i];
			list.add(sum);
		} else {
			for (int i = start; i < arr.length; i++) {
				temp[current] = arr[i];
				makeCombination(arr, list, r, temp, current + 1, i + 1);
			}
		}
	}
	public boolean isPrime(int p){
		for(int i = 2; i < p / 2; i++){
			if(p % i == 0)
				return false;
		}
		return true;
	}
    public int solution(int[] nums) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		makeCombination(nums, list, 3, new int[3], 0, 0);
		for(int i = 0; i < list.size(); i++)
			answer += isPrime(list.get(i)) ? 1 : 0;
        return answer;
	}
	public int solution2(int[] nums){
		int answer = 0;
		for(int i = 0; i < nums.length - 2; i++){
			for(int j = i + 1; j < nums.length - 1; j++){
				for(int k = j + 1; k < nums.length; k++)
					if(isPrime(nums[i] + nums[j] + nums[k]))
						answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int []nums = {1, 2, 3, 4};
		new Solution().solution(nums);
	}
}