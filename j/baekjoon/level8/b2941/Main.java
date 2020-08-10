package baekjoon.level8.b2941;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String chs[] = {"c=", "c-",  "d-", "lj", "nj", "s=", "dz=", "z="};
		int res = s.length();
		int [] a = new int[8];
		for(int i = 0; i < 8; i++)
		{ 
			int fromIndex = -1;
			while ((fromIndex = s.indexOf(chs[i], fromIndex + 1)) >= 0) {
			  a[i]++;
			}
		}
		a[7] -= a[6];
		for(int i = 0; i < 8; i++)
			res -= (chs[i].length() - 1) * a[i];
		bw.write(Integer.toString(res));
		bw.flush();
	}
}