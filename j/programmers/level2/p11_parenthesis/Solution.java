package programmers.level2.p11_parenthesis;

public class Solution {
	boolean solution(String s) {
		int count = 0;
		for(char c : s.toCharArray())
		{
			if (c == '(')
				count++;
			else if (c == ')')
				count--;
			if (count < 0)
				return false;
		}
        return count == 0;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("(((((())") ? "true" : "false");
	}
}
