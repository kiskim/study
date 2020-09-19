package programmers.level1.p28_password;

public class Main {
    public String solution(String s, int n) {
		String answer = "";
		char [] list = s.toCharArray();
		for(char c : list)
		{
			if(c != ' ')
			{
				char temp = c >= 'a' && c<='z' ? 'z' : 'Z';
				c += n;
				if(c > temp)
					c -= 26;
			}
			answer+=c;
		}
        return answer;
	}

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.solution("a B z", 4));
		System.out.println(m.solution("AB", 1));
		System.out.println(m.solution("z", 1));
		System.out.println(m.solution("Z", 10));
		System.out.println(m.solution("a B z", 4));
		System.out.println(m.solution("aBZ", 20));
		System.out.println(m.solution("y X Z", 4));
		System.out.println(m.solution(" h z", 20));
	}
}
