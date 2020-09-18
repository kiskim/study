package programmers.level1.p24_uniform;

import java.util.Arrays;

public class Main {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int [] st = new int[n];
		Arrays.fill(st, 1);
		for(int a : lost)
			st[a - 1]--;
		for(int a : reserve)
			st[a - 1]++;
		for(int i = 0; i < n - 1; i++)
		{
			switch(st[i])
			{
				case 0: 
					if(st[i + 1] > 1){
						st[i]++;
						st[i + 1]--;
					}
				break;
				case 2:	
					if(st[i + 1] == 0){
						st[i]--;
						st[i + 1]++;
					}
				break;
			}
		}
		for(int a: st)
		{
			if(a >= 1)
				answer++;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		int [] lost = {5, 6};
		int [] reserve = {4, 5};
		System.out.println(m.solution(8, lost, reserve) + "");
		;
	}
}
