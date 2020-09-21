package programmers.level1.p33_min_max;

public class Main {
    public int[] solution(int n, int m) {
		int[] answer = new int[2];
		if(n > m){
			int temp = n;
			n = m;
			m = temp;
		}
		answer[0] = 1;
		for(int i = n; i > 1; i-- )
			if( n % i == 0 && m % i == 0)
			{
				answer[0] = i;
				break;
			}
		int t_n = n, t_m = m;
		while(t_n != t_m)
		{
			if(t_n < t_m)
				t_n += n;
			else
				t_m += m;
		}
		answer[1] = t_n;
        return answer;
    }
}
