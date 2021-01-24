package programmers.level1.p40_ternaryScale;

public class Solution {
	public int solution(int n) {
		int answer = 0;
		StringBuilder sb = new StringBuilder("");
		while(n > 0){
			sb.insert(0, Integer.toString(n % 3));
			n = n / 3;
		}
		int i = 0;
		for(char c: sb.toString().toCharArray()){
			answer += (c - '0') * (int)Math.pow(3, i++);
		}
		return answer;
	}
	public static void main(String[] args) {
		new Solution().solution(45);
	}
}
