package baekjoon.level9.b1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for(int i = a; i <= b ; i++)
			if(isPrime(i))
				bw.write(i+"\n");
		bw.flush();
	}
}