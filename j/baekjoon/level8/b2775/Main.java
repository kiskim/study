package baekjoon.level8.b2775;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [][]a = new int [15][14];
		int in;
		for(int n = 0; n < 14; n++)
			a[0][n] = n+1;
		for(int k = 1; k < 15; k++)
		{
			for(int n = 0; n < 14; n++)
				a[k][n] = n == 0 ? 1 : a[k - 1][n] + a[k][n - 1];
		}
		in = Integer.parseInt(br.readLine());
		for(int i = 0; i < in; i++)
		{
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(a[k][n - 1]+"\n");
		}
		bw.flush();
	}
}