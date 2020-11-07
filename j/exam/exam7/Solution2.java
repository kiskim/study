package exam.exam7;


public class Solution2 {
	public long[] solution(String s, String op) {
		long[] answer = new long[s.length() - 1];
		long a = 0, b = 0;
		StringBuilder sb = new StringBuilder(s);
		for (int i = 1; i < s.length(); i++){
			a = Long.parseLong(sb.substring(0, i));
			b= Long.parseLong(sb.substring(i));
			switch(op)
			{
				case "+" : answer[i - 1] = a + b; break;
				case "-" : answer[i - 1] = a - b; break;
				case "*" : answer[i - 1] = a * b; break;
				case "/" : answer[i - 1] = a / b;break;
			}
		}
        return answer;
	}
	
	public static void main(String[] args) {
		new Solution2().solution("987987", "-");
	}
}
