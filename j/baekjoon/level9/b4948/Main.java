package baekjoon.level9.b4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static boolean isPrime(int a) {
		boolean flag = a > 1 ? true : false;
		for (int j = 2; j <= Math.sqrt(a); j++) {
			if (a % j == 0) {
				return false;
			}
		}
		return flag;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		int a, count;
		while((a = Integer.parseInt(br.readLine())) != 0)
		{
			count = 0;
			for(int i = a + 1; i <=a * 2; i++)
			{
				count += isPrime(i) ? 1 : 0;
			}
			bw.write(count+"\n");
		}
		bw.flush();
	}
}