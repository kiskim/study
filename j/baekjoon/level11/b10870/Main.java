package baekjoon.level11.b10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int fibonacci(int n) {
		if (n < 0)
			return -1;
		else if (n == 0 || n == 1)
			return n;
		else
			return fibonacci(n - 2) + fibonacci(n - 1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(Integer.toString(fibonacci(a)));
	}
}