package programmers.level1.p09_add;

public class Main {
	// level 1 - 자릿수 더하기
    public int solution(int n) {
		int answer = 0;
		while (n >= 10)
		{
			answer += n % 10;
			n /=10;
		}
        return answer + n;
    }
}