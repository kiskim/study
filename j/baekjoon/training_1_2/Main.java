package baekjoon.training_1_2;

import java.util.Scanner;

public class Main {
	public static void main(String [] argv){
		int a = 2000, b = 2000, tmp = 0;
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			a = a > (tmp = scn.nextInt()) ? tmp : a;
		for (int i = 0; i < 2; i++)
			b = b > (tmp = scn.nextInt()) ? tmp : b;
		System.out.println(a + b - 50);
		scn.close();
	}
}