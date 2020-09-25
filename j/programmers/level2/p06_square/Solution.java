package programmers.level2.p06_square;
/**
 * 가로가 8, 세로가 12인 직사각형 예시 풀이
 * 1. 반복되는 패턴의 끝나는 좌표가 [2, 3], [4, 6], [6, 9], [8, 12]로 (2, 3)씩 증가
 * 2. 2와 3은 8과 12의 최대 공약수로 나눈 결과값
 * 3. 한 패턴 당 사용할 수 있는 사각형 = 패턴 내 갯수 - (패턴 가로 길이 + 패턴 세로 길이 - 1)
 * 	-> 패턴 하나를 지나가는 동안 가로 2칸 세로 3칸을 이동하는데 이 중 겹치는 1칸을 빼준다.
 * 4. 패턴은 최대 공약수 만큼 반복
 * 전체 갯수 - (최대 공약수 * (가로 약수 + 세로 약수 - 1))
 * 8 * 12 - 4 * (2 + 3 - 1)
 * 96 - 16 = 80
 */
class Solution {
    public long solution(int w, int h) {
		long max = 0;
		long lw = w;
		long lh = h;
		long limit = lw > lh ? lh : lw;
		for(int i = 1; i <= limit; i++)
		{
			if(w % i == 0 && h % i == 0)
				max = i;
		}

        return (lw * lh) - (max * (((lw  + lh) / max) - 1));
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().solution(8, 12)+"");
	}
}
