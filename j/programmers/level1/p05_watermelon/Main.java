package programmers.level1.p05_watermelon;

import java.util.Scanner;

public class Main {

	public static String solution(int n) {
		StringBuilder answer = new StringBuilder("");
		for (int i = 0; i < n; i++) 
			answer.append(i % 2 == 0 ? "수" : "박");
		return answer.toString();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(solution(scn.nextInt()));
		scn.close();
	}
}