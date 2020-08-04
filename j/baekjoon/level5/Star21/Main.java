package baekjoon.level5.Star21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, line, flag = 0;
		try
		{
			n = Integer.parseInt(br.readLine());
			line = n != 1 ? n * 2 : 1;
			for(int i = 0; i < line; i++)
			{
				for(int j = 0; j < n; j++)
					bw.write((j % 2 == flag ? '*' : ' '));
				bw.write("\n");
				flag = flag == 1 ? 0 : 1;
			}
			bw.close();
			br.close();
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}
}