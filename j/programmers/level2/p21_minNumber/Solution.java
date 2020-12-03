package programmers.level2.p21_minNumber;

import java.util.Arrays;

public class Solution {
    public int solution(int []A, int []B)
    {
		int answer = 0;
		int [] bb = new int[B.length];
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0; i < B.length; i++){
			bb[i] = B[B.length - 1 - i];
		}
		for(int i = 0; i < A.length; i++){
			answer += A[i] * bb[i];
		}
        return answer;
    }	

	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		new Solution().solution(A, B);
	}
}