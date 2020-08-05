package baekjoon.level8.b1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		str = str.toLowerCase();
		int a[] = new int[26];
		int max = 0, flag = 0, index = 0;
		char res;
		Arrays.fill(a, 0);
		for(int i = 0; i < str.length(); i++)
			a[str.charAt(i) - 'a']++;
		for(int i = 0; i < 26; i++)
		{
			if(max < a[i])
			{
				flag = 0;
				max = a[i];
				index = i;
			}
			else if (max == a[i])
				flag++;
		}
		res = (char)(flag == 0 ? index + 'A' : '?');
		bw.write(res);
		bw.flush();
		bw.close();
		br.close(); 
	}
}