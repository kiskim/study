package programmers.level2.p05_124;
/**
 * 3으로 나눈 나머지에 따라
 * 0 -> 4
 * 1 -> 1
 * 2 -> 2
 * 
 * 추가 조건 : 3으로 나눈 나머지가 0인 경우 n에 -1 해준다 
 */
class Solution {
	public String solution(int n)
	{
		int remain = n % 3;
		char c = '\0';
		switch(remain)
		{
			case 1: c = '1'; break;
			case 2: c = '2'; break;
			case 0: c = '4'; break;
		}
		if(remain == 0)
			n--;
		if(n / 3> 0)
			return solution(n / 3)+Character.toString(c);
		else
			return Character.toString(c);
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(513));
	}
}