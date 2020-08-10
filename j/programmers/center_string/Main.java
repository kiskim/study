package programmers.center_string;

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

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String res = solution(s);
		System.out.println(res);
		scn.close();
	}
}