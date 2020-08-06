package baekjoon.level8.b1152;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int c = 0;
		if (str.charAt(0) == ' ' && str.length() == 1)
		{
			bw.write(Integer.toString(0));
		}
		else
		{
			for(int i = 1; i < str.length() - 1; i++)
			{
				if(str.charAt(i) == ' ')
					c++;
			}
			bw.write(Integer.toString(c + 1));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}