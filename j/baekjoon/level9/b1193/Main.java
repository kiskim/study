package baekjoon.level9.b1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int line = 1;
		while(line < a)
		{
			a -=line;
			line++;
		}
		String res = line % 2 == 0 ?  a+"/"+(line+1-a) :(line+1-a)+"/"+a;
		System.out.println(res);
	}
}