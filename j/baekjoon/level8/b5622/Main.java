package baekjoon.level8.b5622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String d[] = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int res = 0;
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if (d[j].contains(s.charAt(i)+""))
				{
					res += j + 3;
					break;
				}
			}
		}
		bw.write(Integer.toString(res));
		bw.flush();
	}
}