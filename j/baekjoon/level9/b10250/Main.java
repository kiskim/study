package baekjoon.level9.b10250;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int a = Integer.parseInt(br.readLine());
		for(int i = 0; i < a; i++)
		{
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			/*int w = */Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			bw.write(Integer.toString((((n - 1) % h + 1) * 100) + ((n - 1) / h + 1))+"\n");
		}
		bw.flush();
	}
}