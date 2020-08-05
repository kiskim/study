package baekjoon.level8.b11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try 
		{
			int n = Integer.parseInt(br.readLine());
			int res = 0;
			String in = br.readLine();
			for(int i = 0; i < n; i++)
				res += in.charAt(i) - '0';
			bw.write(Integer.toString(res));
			bw.flush();
			bw.close();
			br.close();
		} 
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}
}