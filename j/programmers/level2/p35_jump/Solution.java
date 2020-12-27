package programmers.level2.p35_jump;

public class Solution{
	/**
	 * 순간이동 가능 거리: 이 전까지 이동한 거리 x 2번 까지
	 * 점프 시 배터리 + 1
	 * 전체 거리의 절반만큼 이동하면 나머지는 순간이동 가능
	 * 이동에 필요한 거리가 홀수이면 점프 + 1
	 * 
	 */
	public int solution(int n) {
		int ans = 0;
		int center = n / 2;
		ans += n % 2;
		if (center > 0)
			ans += solution(center);
		return ans;
	}
	public static void main(String[] args) {
		int n = new Solution().solution(5000);
		System.out.println(n);
	}
}