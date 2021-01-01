package programmers.level2.p40_makePrime;

import java.util.Arrays;

class Solution {
	public void getPrimeList(boolean[] list, int n){
		list = new boolean[n+1];
		list[0] = false;
		list[1] = false;
		for(int i = 2; i <= n; i++)
			list[i] = true;
		for(int i = 2; i * i <= n; i++)
			if(list[i])
			{
				for(int j = i * i; j <= n; j += i)
					list[j] = false;
			}
	}
    public int solution(int[] nums) {
		int answer = -1;
		boolean [] primeList = null;
		Arrays.sort(nums);
		int n = 0;
		for(int i = 1; i < 4; i++ )
			n += nums[nums.length - i];
		getPrimeList(primeList, n);

        return answer;
    }
}