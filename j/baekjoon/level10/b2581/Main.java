package baekjoon.level10.b2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean [] list;

	public static void setPrime() {
		list[1] = false;
		list[0] = false;
		for(int i = 2; i < 10001; i++)
		{
			for(int j = i * 2; j < 10001; j+=i)
				list[j] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int res = 0;
		int min = n;
		list = new boolean[10001];
		for(int i = 1; i < 10001; i++)
			list[i] = true;
		setPrime();
		for(int i = m; i <= n; i++)
		{
			if(list[i])
			{
				res += i;
				min = min > i ? i : min;
			}
		}
		if(res == 0)
			System.out.println("-1");
		else
		{
			System.out.println(Integer.toString(res));
			System.out.println(Integer.toString(min));
		}
	}
}