package programmers.level1.p26_crain;

import java.util.Stack;

public class Main {
	/**
	 * [[0,0,0,0,0] 	[1,5,3,5,1,2,1,4]
	 * ,[0,0,1,0,3]
	 * ,[0,2,5,0,1]
	 * ,[4,2,4,4,2]
	 * ,[3,5,1,3,1]]
	 */
    public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int floor;
		Stack<Integer> box = new Stack<>();
		for(int move_index = 0; move_index < moves.length; move_index++)
		{
			for(floor = 0; floor < board.length; floor++)
			{
				if(board[floor][moves[move_index] - 1] != 0)
				{
					if(!box.empty() && box.peek() == board[floor][moves[move_index] - 1])
					{
						box.pop();
						answer++;
					}
					else
						box.push(board[floor][moves[move_index] - 1]);
					board[floor][moves[move_index] - 1] = 0;
					break;
				}
			}
		}
        return answer * 2;
	}
	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		System.out.println(Integer.toString(solution(board, moves)));
	}
}