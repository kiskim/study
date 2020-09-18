package baekjoon.level9.b1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int c = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < a; i++)
		{
			int temp = Integer.parseInt(st.nextToken());
			boolean flag = temp > 1 ? true : false;
			for(int j = 2; j <= temp / 2; j++)
			{
				if(temp % j == 0)
				{
				flag = false;
				break;
				}
			}
			c += flag ? 1: 0; 
		}
		System.out.println(Integer.toString(c));
	}
}