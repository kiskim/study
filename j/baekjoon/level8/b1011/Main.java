package baekjoon.level8.b1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		while(a-- > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x, y, d, max, res = 0;
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			d = y - x;
			max = (int)Math.sqrt(d);
			d = d - max * max;
			for(int i = max; i > 0; i--)
			{
				if(d / i > 0)
				{
					res += d / i;
					d = d % i;
					i = d;
				}
			}
			res += max * 2 - 1;
			bw.write(Integer.toString(res)+"\n");
		}
		bw.flush();
	}
}