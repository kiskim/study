package baekjoon.level9.b2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] a = new int[3];
		int res;
		for(int i = 0; i < 3; i++)
			a[i] = Integer.parseInt(st.nextToken());
		res = (a[2] - a[1]) / (a[0] - a[1]);
		res += (a[2] - a[1]) % (a[0] - a[1]) > 0 ? 1 : 0; 
		System.out.println(Integer.toString(res));
	}
}