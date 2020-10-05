package programmers.level1.p01_get_middle;

public class Main2 {
	public String solution (String s)
	{
		String answer = "";
		int idx = s.length() / 2;
		answer+= s.charAt(idx);
		if(idx * 2 == s.length())
			answer = s.charAt(idx-1)+answer;
		return answer;
	}
}
