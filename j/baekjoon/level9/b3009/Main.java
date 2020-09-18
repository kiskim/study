package baekjoon.level9.b3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int a[], b[];

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int x = 0, y = 0;
		a = new int[1001];
		b = new int[1001];
		for(int i = 0; i < 1001; i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for(int i =0; i < 3; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			a[Integer.parseInt(st.nextToken())]++;
			b[Integer.parseInt(st.nextToken())]++;
		}
		for(int i = 0; i < 1001; i++)
		{
			if (a[i] == 1)
				x = i;
			if (b[i] == 1)
				y = i;
		}
		System.out.println(x+" "+y);
	}
}