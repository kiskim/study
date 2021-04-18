package programmers.level2.p26_leasetComMul;

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
		int answer;
		Arrays.sort(arr);
		answer = arr[arr.length - 1];
		while(true){
			int i;
			for(i = 0; i < arr.length; i++){
				if(answer % arr[i] != 0)
					break;
			}
			if (i == arr.length)
				break;
			answer += arr[arr.length - 1];
		}
        return answer;
	}
	
	public static void main(String[] args) {
		int [] arr = {2, 6, 8, 14};
		new Solution().solution(arr);
	}
}