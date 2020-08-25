package baekjoon.level11.b10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int res = 1;
		for(int i = 1; i <= a; i++)
			res *= i;
		System.out.println(Integer.toString(res));
	}
}