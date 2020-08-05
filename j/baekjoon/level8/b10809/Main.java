package baekjoon.level8.b10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a[] = new int[26];;
		String input;
		for (int i = 0 ; i < 26; i++)
			a[i] = -1;
		input = br.readLine();
		for (int i = 0; i < input.length(); i++)
			a[input.charAt(i) - 'a'] = a[input.charAt(i) - 'a'] == -1 ? i : a[input.charAt(i) - 'a'];
		for(int i = 0; i < 26; i++)
			bw.write(Integer.toString(a[i]) + " ");
		bw.flush();
		br.close();
		bw.close();
	}
}