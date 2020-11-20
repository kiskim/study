package programmers.level2.p17_targetNumber;

public class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(0, 0, numbers, target);
        return answer;
	}
	// https://www.pymoon.com/entry/Programmers-%ED%83%80%EA%B2%9F-%EB%84%98%EB%B2%84-BFSDFS-Java-%ED%92%80%EC%9D%B4
	public int dfs(int pre, int idx, int[] number, int target){
		int answer = 0;
		if (idx == number.length){
			if (pre == target)
				return 1;
			return 0;
		}
		answer += dfs(pre + number[idx], idx + 1, number, target);
		answer += dfs(pre - number[idx], idx + 1, number, target);
		return answer;
	}
}
