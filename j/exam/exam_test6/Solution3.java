package exam.exam_test6;

public class Solution3 {
	public String solution(String s)
	{
		StringBuilder sb = new StringBuilder("");
		char comp = '\0';
		char a = '\0';
		for (char c : s.toCharArray())
		{
			if (c != ' '){
				comp = c > 'Z' ? 'z' : 'Z';
				a = c > 'Z' ? 'a' : 'A';
				sb.append((char)(Math.abs(c - comp) + a));
			}
			else
				sb.append(' ');
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "I love you";
		Solution3 s = new Solution3();
		s.solution(str);
	}
}
