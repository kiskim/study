package programmers.level2.p09_snail;

public class Solution {
    public int[] solution(int n) {
		int[] answer = {};
		int [][] snail = new int[n][];
		for(int i = 1; i < n + 1; i++){
			snail[i-1] =  new int[i]; 
			snail[i-1][0] = i;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(3);
	}
}
