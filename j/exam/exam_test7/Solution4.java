package exam.exam7;

import java.util.Arrays;

public class Solution4 {
	
	public int solution(int n, int[][] board) {
		int answer = 0;
		int pos_x = 0;
		int pos_y = 0;
		int x_d = 0;
		int y_d = 0;
		for (int i = 1; i <= n * n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					if (i == board[j][k]){
						int temp_x =  (n - 1 - pos_x) + k + 1 > (n - 1 - k) + pos_x + 1 ? (n - 1 - k) + pos_x + 1 : (n - 1 - pos_x) + k + 1;
						int temp_y =  (n - 1 - pos_y) + j + 1 > (n - 1 - j) + pos_y + 1 ? (n - 1 - j) + pos_y + 1 : (n - 1 - pos_y) + j + 1;
						x_d = Math.abs(pos_x - k) > temp_x? temp_x: Math.abs(pos_x - k);
						y_d = Math.abs(pos_y - j) > temp_y? temp_y: Math.abs(pos_y - j);
						answer += x_d + y_d + 1;
						pos_x = k;
						pos_y = j;
						break;
					}
				}
			}
		}
        return answer;
	}

	public static void main(String[] args) {
		int board[][] = {{3, 5, 6}, {9, 2, 7}, {4, 1, 8}};
		new Solution4().solution(3, board);
	}
}
