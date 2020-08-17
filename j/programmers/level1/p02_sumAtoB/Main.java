package programmers.level1.p02_sumAtoB;

public class Main {
	public static long solution(int a, int b){
		long res = 0;
		int temp;
		if (a > b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		for(int i = a; i < b + 1; i++)
			res += i;
		return res;
	}
	// 등차 수열 합 공식
	public static long sumAtoB(long a, long b)
	{
		return (b - a + 1) * (a + b) / 2;
	}
	public static long solution2(int a, int b){
		int temp;
		if (a > b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		return sumAtoB(a, b);
	}
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 3));
	}
}