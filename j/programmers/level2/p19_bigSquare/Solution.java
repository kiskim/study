package programmers.level2.p19_bigSquare;

class Solution
{
    public int solution(int [][]board)
    {
        int answer = -1;

        for(int i = 1;  i < board.length; i++){
            for(int j = 1;  j < board[0].length; j++){
                if (board[i][j] > 0){
                    board[i][j] = Math.min(Math.min(board[i - 1][j - 1], board[i - 1][j]), board[i][j - 1]) + 1;
                }
            }
        }
        for(int i = 0;  i < board.length; i++){
            for(int j = 0;  j < board[0].length; j++){
                if (answer < board[i][j])
                    answer = board[i][j];
            }
        }
        if (answer < 0)
            return 0;
        return answer * answer;
    }
}