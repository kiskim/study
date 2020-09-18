package exam._04_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class k_num {
    public int[] solution(int[] array, int[][] commands) {
		int[] answer;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int [] c : commands){
			temp.clear();
			for(int i = c[0] - 1; i < c[1]; i++)
				temp.add(array[i]);
			Collections.sort(temp);
			list.add(temp.get(c[2] - 1));
		}
		answer = new int [list.size()];
		for(int i = 0; i < answer.length; i++)
			answer[i] = list.get(i);
        return answer;
	}
    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
	}
	public static void main(String[] args) {
		int [][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		k_num k = new  k_num();
		int [] res = k.solution(array, command);
		for(int i : res)
			System.out.println(i+"");
	}
}