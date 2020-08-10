package programmers.level1.desc_string;

import java.util.Scanner;

public class Main {
	
	public static String solution(String s)
	{
		char t;
		char[] temp = s.toCharArray();
		for(int i = 0; i < s.length() - 1; i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				if(temp[i] < temp[j])
				{
					t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
			}
		}
		s = String.valueOf(temp);
		return s;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		System.out.println(solution(s));
		scn.close();
	}
}