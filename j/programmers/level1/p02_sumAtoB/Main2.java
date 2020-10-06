package programmers.level1.p02_sumAtoB;

public class Main2 {
	public long solution(int a, int b)
	{
		long la = 0, lb = 0;
		long answer = 0;
		if(a > b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		la = a;
		lb = b;
		answer = (lb - la + 1) * (la + lb) / 2;
		return answer;
	}
}
