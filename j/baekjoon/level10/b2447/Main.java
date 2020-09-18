package baekjoon.level10.b2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static char[][] map;

	public static void drawStar(int x, int y, int n){
		if(n == 1)
		{
			map[x][y] = '*';
		}
		int m = n / 3;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(i == 1 && j == 1)
					continue;
				drawStar(x + i * m, y + j * m, m);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		for(int i = 0; i < n; i++)
			Arrays.fill(map[i], ' ');
		drawStar(0, 0, n);
		for(int i = 0; i < n; i++)
			System.out.println(map[i]);
	}
	
}