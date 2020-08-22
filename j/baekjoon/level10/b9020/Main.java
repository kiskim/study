package baekjoon.level10.b9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static boolean [] list;

	public static void setPrime() {
		for(int i = 2; i < 10001; i++)
		{
			for(int j = i * 2; j < 10001; j+=i)
				list[j] = false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int a, x, y, min;
		list = new boolean [10001];
		for(int i = 1; i < 10001; i++)
			list[i] = true;
		setPrime();
		while(n-- > 0)
		{
			x = 0;
			y = 0;
			a = Integer.parseInt(br.readLine());
			min = a;
			for(int i = 2; i <= a / 2; i++)
			{
				if(list[i] && list[a - i] && min > Math.abs(i - (a - i)))
				{
					min = Math.abs(i - (a - i));
					x = i;
					y = a - i;
				}
			}
			bw.write(x+" "+y+"\n");
		}
		bw.flush();
	}
}