package programmers.level1.p36_budget;

import java.util.Arrays;

public class Main {
    public int solution(int[] d, int budget) {
		int temp = 0;
		Arrays.sort(d);
		int i = 0;
		for( i = 0; i < d.length; i++)
		{
			temp += d[i];
			if(temp > budget)
				break;
		}
        return i;
    }
}
