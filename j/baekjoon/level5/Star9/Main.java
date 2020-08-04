package baekjoon.level5.Star9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, sp = 0, s;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		s = n * 2 - 1;
		for(int i = 0; i < n * 2 - 1; i++){
			for(int j = 0; j < sp; j++)
				System.out.print(" ");
			for(int j = 0; j < s; j++)
				System.out.print("*");
			System.out.println();
			sp = i < n - 1 ? sp + 1 : sp - 1;
			s = i < n -1 ? s - 2 : s + 2;
		}
		scn.close();
	}
}