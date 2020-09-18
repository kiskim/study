package exam.exam_test;

public class _06 {
    public int solution(int[][] board, int r, int c) {
		int answer = 0;
		int count = 0;
		int min = 0;
		int dist = 0;
		int temp_c = 0;
		int temp_r = 0;
		while(true)
		{
			count = 0;
			if(board[r][c] != 0)
			{
				answer++;
				for(int i = 0; i < 4; i++)
				{
					for(int j = 0; j < 4; j++)
					{
						if(board[i][j] != 0 && !(r == i && c == j) &&  board[i][j] == board[r][c])
						{
							board[i][j] = 0;
							board[r][c] = 0;
							answer += (i == r ? 0 : 1) + (j == c ? 0 :1) + 1;
							r = i;
							c = j;
						}
					}
				}
			}
			if(board[r][c] == 0)
			{
				min = 5;
				dist = 16;
				for(int i = 0; i < 4; i++)
				{
					for(int j = 0; j < 4; j++)
					{
						if(board[i][j] != 0 )
						{
							if(min > (i == r ? 0 : 1) + (j == c ? 0 :1) && dist > Math.abs(i - r) + Math.abs(j - c))
							{
								temp_r = i;
								temp_c = j;
								min = (i == r ? 0 : 1) + (j == c ? 0 :1);
								dist = Math.abs(i - r) + Math.abs(j - c);
							}
						}
						else
							count++;
					}
				}
				if(count < 16){
					r = temp_r;
					c = temp_c;
					answer+= min;
				}
			}
			if(count == 16)
				break;
		}
        return answer;
	}

	public static void main(String[] args) {
		int [][] input = {{1, 0, 0, 3}, {2, 0, 0, 0}, {0, 0, 0, 2},{3, 0, 1, 0}};
		_06 test = new _06();
		System.out.println(test.solution(input, 1, 0)+"");
	}
	
}
