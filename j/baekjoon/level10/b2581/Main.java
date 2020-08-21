package baekjoon.level10.b2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static boolean isPrime(int a)
	{
		boolean flag = a > 1 ? true : false;
		for(int j = 2; j <= Math.sqrt(a); j++)
		{
			if(a % j == 0)
			{
				return false;
			}
		}
		return flag;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int res = 0;
		int min = n;
		for(int i = m; i <= n; i++)
		{
			if(isPrime(i))
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