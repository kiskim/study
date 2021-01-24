package programmers.level1.p13_collatz;

public class Main {
	//콜라츠 추측
    public int solution(int num) {
		long n = num;
		int answer = 0;
		while(n != 1 && answer <= 500)
			n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        return answer >= 500 ? -1 : answer;
    }
}