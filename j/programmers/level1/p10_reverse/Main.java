package programmers.level1.p10_reverse;

public class Main {
    public static int [] solution(long n) {
		int len = 0;
		long temp = n;
		while(temp> 0)
		{
			temp /= 10;
			len++;
		}
		
		int[] answer = new int[len];
		for(int i = 0; i < len; i++)
		{
			answer[i] = (int)(n % 10);
			n /= 10;
		}
        return answer;
	}
	public static void main(String[] args) {
		int [] a = null;
		a = solution(1234928405);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]+"");
	}
}