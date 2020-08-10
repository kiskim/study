package programmers.level1.get_middle;

import java.util.Scanner;

public class Main {

	public static String solution(String s){
		String answer;
		if(s.length() % 2 == 0)
		{
			answer = s.charAt(s.length() / 2 - 1)+""+s.charAt(s.length() / 2);
		}
		else
			answer = s.charAt(s.length() / 2)+"";
		return answer;
	}
	public static String solution2(String s)
	{
		return s.length() > 0 ? s.substring((s.length() - 1) / 2 , s.length() / 2 + 1)  : s;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String res = solution2(s);
		System.out.println(res);
		scn.close();
	}
}