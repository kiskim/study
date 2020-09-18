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
		for(int j = 0; j < answer.length; j++)
		{
			for(int i = 0; i < answers.length; i++)
			{
				if(answers[i] == answer[j][i % answer[j].length])
					score[j]++;
					
			}
			max = max < score[j] ? score[j] : max;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 3; i++)
		{
			if(score[i] == max)
				list.add(i+1);
		}
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
