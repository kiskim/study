package programmers.level2.p09_snail;

public class Solution {
    public int[] solution(int n) {
		int[] answer = {};
		int max = n * (n + 1) / 2;
		int [] snail = new int[max];
		int start = 0;
		int index = start + 1;
		for(int i = 0; i < n; i++)
		{
			index += i;
			snail[index - 1] = i + 1;
		}
		for(int i = max - (n - 1); i < max; i++)
			snail[i] = snail[i - 1] + 1;
		int i = n;
		index = max - 1;
		while(index - i != start)
		{
			snail[index - i] = snail[index] + 1;
			index -= i;
			i = i - 1;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(6);
	}
}
