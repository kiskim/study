package baekjoon.training_1_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, count = 0;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		scn.close();
		for(int i = 0; i < n * 2 - 1; i++){
			if (i < n)
				count++;
			else
				count--;
			for(int j = 0; j < count; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}