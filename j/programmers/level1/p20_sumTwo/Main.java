package programmers.level1.p20_sumTwo;

import java.util.*;

public class Main {
    public int[] solution(int[] numbers) {
		int [] answer = null;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i<numbers.length; i++)
		{
			for(int j = 0; j<numbers.length; j++)
			{
				if(i!=j && !list.contains(numbers[i]+numbers[j]))
					list.add(numbers[i]+numbers[j]);
			}
		}
		answer = new int[list.size()];
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);
		return answer;
	}
	
    public int[] solution2(int[] numbers) {
		Set<Integer> list = new HashSet<>();
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = i+1; j < numbers.length; j++)
					list.add(numbers[i]+numbers[j]);
		}
		return list.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}
