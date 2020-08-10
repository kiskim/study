package baekjoon.level8.b1316;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int res = 0;
		String s;
		for(int i = 0; i < n; i++)
		{
			int [] a = new int[26];
			boolean flag = true;
			for(int j = 0; j < 26; j++)
				a[j] = -1;
			s = br.readLine();
			for (int j = 0; j < s.length(); j++)
			{
				if(a[s.charAt(j) - 'a'] == -1 || j - a[s.charAt(j) - 'a'] == 1)
					a[s.charAt(j) - 'a'] = j;
				else
					flag = false;
			}
			if(flag)
				res++;
		}
		bw.write(Integer.toString(res));
		bw.flush();
	}
}