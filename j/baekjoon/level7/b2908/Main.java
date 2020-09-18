package baekjoon.level7.b2908;

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
		String a[] = s.split(" ");
		int n1 = Integer.parseInt(new StringBuffer(a[0]).reverse().toString());
		int n2 = Integer.parseInt(new StringBuffer(a[1]).reverse().toString());
		bw.write(Integer.toString(n1 > n2 ? n1 : n2));
		bw.flush();
		bw.close();
		br.close();
	}
}