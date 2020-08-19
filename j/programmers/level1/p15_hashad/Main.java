package programmers.level1.p15_hashad;

public class Main {
	
    public static int sum_num(int n) {
		int answer = 0;
		while (n >= 10)
		{
			answer += n % 10;
			n /=10;
		}
        return answer + n;
	}
	
    public static boolean solution(int x) {
		int sum = sum_num(x);
        return x % sum == 0 ? true : false;
    }
}