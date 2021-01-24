package programmers.level1.p07_aliquot;

public class Main {
	// level - 1 약수의 합
    public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n / 2; i++)
			answer += n % i == 0 ? i : 0;
        return answer + n;
    }
	public static void main(String[] args) {
		System.out.println(solution(12)+"");
	}
}