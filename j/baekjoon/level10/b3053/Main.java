package baekjoon.level10.b3053;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double r = Double.parseDouble(br.readLine());
		bw.write(String.format("%.6f", Math.PI * r * r)+"\n");
		bw.write(String.format("%.6f", r * r * 2));
		bw.flush();
	}
}