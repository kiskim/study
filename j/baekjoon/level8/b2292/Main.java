package baekjoon.level8.b2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int i = 1, p = 1;
		while (p < a)
			p += 6 * i++;
		System.out.println(i);
	}
}