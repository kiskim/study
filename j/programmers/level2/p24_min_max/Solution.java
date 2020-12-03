package programmers.level2.p24_min_max;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
		String []arr = s.split(" ");
		int []n = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			n[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(n);
        return n[0]+" "+n[n.length - 1];
	}
	public static void main(String[] args) {
		String s = "1 2 3 4";
		new Solution().solution(s);
	}
}
