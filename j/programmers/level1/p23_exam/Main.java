package programmers.level1.p23_exam;

import java.util.ArrayList;

public class Main {
	public int[] solution(int[] answers) {
		int max = 0;
		int [] score = new int[3];
		int [][] answer = {
			{1, 2, 3, 4, 5},
			{2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		for(int i = 0; i < answers.length; i++)
		{
			if(answers[i] == answer[0][i % answer[0].length]) score[0]++;
			if(answers[i] == answer[1][i % answer[1].length]) score[1]++;
			if(answers[i] == answer[2][i % answer[2].length]) score[2]++;
				
		}
		ArrayList<Integer> list = new ArrayList<>();
		max = Math.max(score[0], Math.max(score[1], score[2]));
		if(score[0] == max)	list.add(1);
		if(score[1] == max)	list.add(2);
		if(score[2] == max)	list.add(3);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
