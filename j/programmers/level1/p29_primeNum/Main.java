package programmers.level1.p29_primeNum;
/**
 * 1. 반복문을 이용한 함수를 이용한 방식 사용
 * ->	반복문 2중첩 + 나눗셈 연산이 들어가 시간 복잡도가 매우 높음
 *		정확성 테스트에서도 시간 초과가 발생할 정도로 느림	
 * 2. 에라토스테네스의 체를 ArrayList를 이용한 방식
 * ->	정확성 테스트는 모두 통과됐지만 효율성에서 모두 실패
 * 3. 에라토스테네스의 체를 배열로 구현
 * -> 	정확성, 효율성 테스트 모두 통과
 */
public class Main {
    public int solution(int n) {
		int answer = 0;
		boolean [] primeList = new boolean[n+1];
		primeList[0] = false;
		primeList[1] = false;
		for(int i = 2; i <= n; i++)
			primeList[i] = true;
		for(int i = 2; i * i <= n; i++)
			if(primeList[i])
			{
				for(int j = i * i; j <= n; j += i)
					primeList[j] = false;
			}
		for(boolean a : primeList)
			if(a)
				answer++;
        return answer;
	}
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.solution(5));
	}
}
