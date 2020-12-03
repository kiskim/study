package programmers.level2.p25_matrix_mul;

public class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
	int[][] answer = new int[arr1.length][arr2[0].length];
	for(int i = 0; i < arr2[0].length; i++){
		for(int j = 0;  j < arr1.length; j++){
			for(int k = 0; k < arr1[0].length; k++){
				answer[j][i] += arr1[j][k] * arr2[k][i]; 
			}
		}
	}
	return answer;
	}
	public static void main(String[] args) {
		int arr1[][] = {{1, 4}, {3, 2}, {4, 1}}; 	
		int arr2[][] = {{3, 3}, {3, 3}};
		new Solution().solution(arr1, arr2);
	}
}
