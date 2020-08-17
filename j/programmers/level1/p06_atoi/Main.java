package programmers.level1.p06_atoi;

public class Main {
	public static int solution(String s){
		int res = 0;
		int flag = 1;
		for(int i = 0; i < s.length(); i++){
			switch (s.charAt(i))
			{
				case '-': flag *=  -1; break;
				case '+': break;
				default :
					res = res * 10 + s.charAt(i) - '0';
					break;
			}
		}
		return res * flag;
	}
	public static void main(String[] args) {
		System.out.println(solution("+123"));
		System.out.println(solution("-123"));
		System.out.println(solution("123"));
	}
}