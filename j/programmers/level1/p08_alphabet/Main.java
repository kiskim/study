package programmers.level1.p08_alphabet;

public class Main {
	public static String solution(String s){
		char [] res = s.toLowerCase().toCharArray();
		System.out.println(String.valueOf(res));
		int flag = 0;
		for(int i = 0; i < s.length(); i++){
			if(((i - flag) % 2 == 0) && (res[i] >= 'a' && res[i] <='z'))
				res[i] -= 32;
			else if(res[i] == ' ')
				flag = i + 1;
		}
		return String.valueOf(res);
	}
	public static void main(String[] args) {
		String s = solution("asdaQWEsda sdasdasd");
		System.out.println(s);
	}
}