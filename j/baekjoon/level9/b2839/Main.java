package baekjoon.level9.b2839;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int res = 2000;
		for(int i = a / 5 + 1; i >= 0; i--)
		{
			for(int j = 0; j <= a / 3; j++)
			{	
				if(5 * i + 3 * j == a)
					res = res > i + j ? i + j : res;
			}
		}
		res = res == 2000 ? -1 : res;
		bw.write(Integer.toString(res));
		bw.flush();
	}
}