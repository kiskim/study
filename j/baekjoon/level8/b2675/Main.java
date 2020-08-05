package baekjoon.level8.b2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		int count;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
			String temp [] = br.readLine().split(" ");
			count = Integer.parseInt(temp[0]);
			str = temp[1];
			for(int j = 0; j < str.length(); j++){
				for(int k = 0; k < count; k++)
					bw.write(str.charAt(j));
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}