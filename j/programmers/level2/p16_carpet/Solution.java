package programmers.level2.p16_carpet;

public class Solution {
    public int[] solution(int brown, int yellow) {
		int block = brown + yellow;
		int x = 0;
		int y = 0;
		for(int i = 3; i <= block / i; i++)
		{
			y = i;
			x = block / i;
			if ((y - 2) * (x - 2) == yellow && y <= x)
				break;
		}
		int[] answer = {x, y};
        return answer;
	}
	public static void main(String[] args) {
		new Solution().solution(10, 2);
	}
}
