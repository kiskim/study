package programmers.level2.p13_fibonacci;

public class Solution {
	public int solution(int n) {
		long res = 0;
		long pre1 = 1;
		long pre2 = 0;
		for (int i = 2; i <= n; i++)
		{
			res = (pre1 + pre2) % 1234567;
			pre2 = pre1 % 1234567;
			pre1 = res % 1234567;
		}
        return (int)res;
    }
}
