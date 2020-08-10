package programmers.level1.two_int;

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
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 3));
	}
}