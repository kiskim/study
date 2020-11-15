package programmers.level2.p09_snail;

public class Solution {
    public int[] solution(int n) {
		int [][] arr = new int[n][n];
		int max = n * (n + 1) / 2;
		int[] answer = new int[max];
		// n * n 배열에서 실제 채워질 곳을 -1로 초기화
		for(int i = 0; i < n; i ++)
		{
			for (int j = 0; j<=i; j++)
				arr[i][j] = -1;
		}
		//세로, 가로, 값
		int i = 0, j = 0, k = 1;
		arr[i][j] = k;
		while (k < max)
		{
			// 공통 조건 : 다음 인덱스가 0보다 작은 것은 앞서 설정했던 입력될 곳 포시를 위해 입력한 -1 값을 확인학 위함
			// 삼각형 좌변 조건
			// i + 1, 즉 세로 인덱스가 n 보다 작은 경우 순서대로 k를 중가시키면서 입력
			while( i + 1 < n && k < max && arr[i + 1][j] < 0)
				arr[++i][j] = ++k;
			// 밑변 조건
			// j + 1, 가로 인덱스가 n보다 작을 때
			while (j + 1 < n && k < max && arr[i][j + 1] < 0)
				arr[i][++j] = ++k;
			// 우변 조건
			// 좌상향으로 이동해야하기 때문에 i, j 모두 -1하며 인덱스 값을 확인
			while (i - 1 > 0 && i - 1 > 0 && k < max && arr[i - 1][j - 1] < 0)
				arr[--i][--j] = ++k;
		}
		k = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				answer[k++] = arr[i][j];
			}
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(6);
	}
}
